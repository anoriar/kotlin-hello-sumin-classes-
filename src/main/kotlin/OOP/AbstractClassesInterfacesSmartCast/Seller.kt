package OOP.AbstractClassesInterfacesSmartCast

class Seller(name: String, age: Int) : Employee(name, age), Cleaner {

    override fun work() {
        println("Продаю товар")
    }

    override fun clean() {
        println("Продавец убирает")
    }
}