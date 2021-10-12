lst = [10,20,30,30, 30, 33, 40];
c={ n->
    println(n%2==0?"even":"odd")
}

//c.call(15)
//
//5.times {x -> println x + 3}
//2.times{println it}
//lst.find(c)
println(lst.find{it > 26})
newLst = lst.unique(false)
println newLst;
println(lst)
println(lst.findAll{it > 26})