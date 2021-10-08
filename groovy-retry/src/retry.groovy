multiLineStr = '''
Mutlieline
String example
'''
name = "jk"
def employees = ["J": 48, "AM": 32, "PG":42]
float a = 2.24F;
int[] arr = [11,22,33,44,55]
for(int i = 0; i <= 5; i++) {
    if (i - a <= 0) {
        continue;
    }
        println i;
}
for (int i in arr) {
    String first = i.toString().split('')[0];
    String second = i.toString().split('')[1];
//    println(first)
    assert first.toInteger() == second.toInteger();
}

for (String emp in employees) {
    if(employees.get(emp) > 45) {
        println(emp)
    }
    println(employees.get(emp))
}
print(employees.get("J"))

print a
println a.class
nameStr = "my initials: ${name}"
println nameStr
println multiLineStr

emailPattern = /[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})/
println emailPattern.getClass()
print "test@gmail.com"==~ emailPattern



