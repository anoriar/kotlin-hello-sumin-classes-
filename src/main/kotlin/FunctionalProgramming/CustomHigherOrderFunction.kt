package FunctionalProgramming

fun main(args: Array<String>) {

    val list = mutableListOf<Int>()

    for (i in 0 until 1000) {
        list.add((Math.random() * 1000).toInt())
    }

    printSum(list) { it.sum() }
}

/**
 * Объявляем inline - т к будет лучше производительность
 * Если не объявить как inline -
 * будет создан анонимный класс и вызван его метод - это ресурсозатратно
 */
inline fun printSum(list: List<Int>, sumFun: (List<Int>) -> Int) {
    println(sumFun(list))
}