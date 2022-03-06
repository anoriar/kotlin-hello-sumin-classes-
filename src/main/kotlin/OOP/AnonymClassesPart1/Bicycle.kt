package OOP.AnonymClassesPart1

class Bicycle(override var name: String = "Велосипед") : Transport(name) {
    override fun drive() {
        println("Велосипед едет")
    }
}

