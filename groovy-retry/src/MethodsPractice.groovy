int product (int x, int y = 6) {
    return x * y;
}
println (product(5, 7))
println(product(3, 8))
println(product(4))

void displayDetails(Map details) {
    println details.name;
    println details.value;
}

displayDetails(value: '4048826481', name: 'phone')
displayDetails name: 'county', value: 'daton'
displayDetails(city: "Indianapolis")