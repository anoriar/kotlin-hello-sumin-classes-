package FunctionalProgramming

fun main(args: Array<String>) {
    val data = mapOf(
        "Январь" to listOf<Int>(100, 100, 100, 100),
        "Февраль" to listOf<Int>(200, 200, -190, 200),
        "Март" to listOf<Int>(300, 180, 300, 100),
        "Апрель" to listOf<Int>(250, -250, 100, 300),
        "Май" to listOf<Int>(200, 100, 400, 300),
        "Июнь" to listOf<Int>(200, 100, 300, 300)
    )

    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filter { it.value.all { it > 0 } }

    val maxRevenue = validData.map { it.value.sum() }.maxOf { it }
    val minRevenue = validData.map { it.value.sum() }.minOf { it }

    println("Средняя выручка в неделю: " + validData.flatMap { it.value }.average())
    println("Средняя выручка в месяц: " + validData.map { it.value.sum() }.average())
    println("Максимальная выручка в месяц: " + maxRevenue)
    println(
        "Была в следующих месяцах: " + validData.filter { it.value.sum() == maxRevenue }.keys
            .joinToString(" ")
    )
    println("Минимальная выручка в месяц:: " + minRevenue)
    println(
        "Была в следующих месяцах: " + validData.filter { it.value.sum() == minRevenue }.keys
            .joinToString(" ")
    )
    println("Ошибки произошли в следующих месяцах: " + data.filterNot { it.value.all { it > 0 } }.map { it.key }
        .joinToString(" "))
}