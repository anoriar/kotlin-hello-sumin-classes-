package OOP.AnonymClassesPart1

class Car(override var name: String = "Велосипед") : Transport(name) {
    override fun drive() {
        println("Машина едет")
    }

    fun startEngine(): Boolean = true
}