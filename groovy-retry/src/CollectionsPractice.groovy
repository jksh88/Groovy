LinkedList lst = [1,2,3]
lst.add(4)
lst << 5;
lst = lst + [6,7]
lst = lst - [2,3]
lst -= [1]
lst.reverseEach {println it % 2 == 0}
//lst.eachPermutation {println it}
println lst;
println lst.class;

langs = ['js', 'python', 'java', 'js'] as Set;
println langs;
println langs.class

myMap = [height: 178, weight: 73]
println myMap
myMap.each{ y -> println (y.key)}
println (myMap["weight"].toString() + '' + myMap.get("height").toString())