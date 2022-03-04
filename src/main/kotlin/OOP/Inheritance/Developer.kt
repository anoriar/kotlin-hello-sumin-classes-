package OOP.Inheritance

class Developer(name: String, age: Int, val language: String) : Employee(name, age) {

    override fun work() {
        println("Пишу код на языке $language")
    }
}