package FunctionalProgramming

fun main(args: Array<String>) {
    val revenueByWeek = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(1, 2, 3, 4, 5),
        listOf(1, 2, 3, 4, 5)
    )

    val average = revenueByWeek.flatMap { it }.average()
//    println(average)

    val data: Map<String, List<Int>> = mapOf(
        "file1" to listOf<Int>(1, 4, 5, 2),
        "file2" to listOf<Int>(1, -4, 5, 2),
        "file3" to listOf<Int>(1, 4, 5, 2)
    )

    val averageAge = data.filter { it.value.all { it > 0 } }.flatMap { it.value }.average()
    println(averageAge)
}