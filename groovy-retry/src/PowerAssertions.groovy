import groovy.mock.interceptor.MockFor

def x = [1,23]

assert (x << 32) == [1, 23, 32]

assert [[1,2,2,4,4,4]].first().unique() == [1,2,4]

class TranslationService {
    String convert(String key) {
        return "just a test"
    }
}

def service = [convert: {String key -> "some text"}] as TranslationService;
assert "some text" == service.convert("key")

class Person {
    String first, last
}

class Family {
    Person father,  mother
    def nameofFather() {"$father.first $father.last"}
}

def mock = new MockFor (Person)
mock.demand.getFirst{'dummy'}
mock.demand.getLast{'name'}
mock.use {
    def manny = new Person(first: 'Manny', last: 'Machado');
    def fam = new Family(father: manny)
    assert fam.nameofFather() == 'dummy name'
}
mock.expect.verify()