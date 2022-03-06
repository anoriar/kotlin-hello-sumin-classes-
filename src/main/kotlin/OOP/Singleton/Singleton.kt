package OOP.Singleton

object Singleton {
    val data = mutableListOf<Int>()

    fun insertData(number: Int) {
        data.add(number)
    }
}