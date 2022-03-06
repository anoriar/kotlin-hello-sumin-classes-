package OOP.Singleton

fun main(args: Array<String>) {
    val singleton: Singleton = Singleton
    singleton.insertData(1)
    singleton.insertData(2)

    println(singleton.data.toList().joinToString())
}
