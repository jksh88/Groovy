class Patient {
    def firstName, lastName, age;

    void setLastname (lastName){
        if (lastName == null) {
            throw new IllegalArgumentException("Need last name");
        }
        this.lastName = lastName;
    }


}

p1 = new Patient(firstName: "Shawn", lastName: "Bradley", age: 50)
p1.setLastname("Jones")
println p1.firstName + ", " + p1.lastName + ", " + p1.age