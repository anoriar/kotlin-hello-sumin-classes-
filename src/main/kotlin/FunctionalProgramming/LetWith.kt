package FunctionalProgramming

val list: MutableList<Int?>? = mutableListOf<Int?>()

fun main(args: Array<String>) {

    list?.let {
        with(list) {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }

            println(filter { it?.let { it % 2 == 0 } ?: false }.take(100).joinToString())
        }
    }
}