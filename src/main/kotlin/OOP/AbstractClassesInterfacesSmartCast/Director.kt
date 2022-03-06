package OOP.AbstractClassesInterfacesSmartCast

class Director(name: String, age: Int) : Employee(name, age) {
    override fun work() {
        println("Управляю процессом")
    }
}