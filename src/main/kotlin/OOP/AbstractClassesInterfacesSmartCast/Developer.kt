package OOP.AbstractClassesInterfacesSmartCast

class Developer(name: String, age: Int, val language: String) : Employee(name, age), Cleaner {
    override fun work() {
        println("Пишу код на языке $language")
    }

    override fun clean() {
        println("Программист убирает")
    }
}