package FunctionalProgramming

fun main(args: Array<String>) {
    val empSequence = generateSequence(1) { it + 1 }.map { "Сотрудник №$it" }
    for(employee in empSequence.take(100)){
        println(employee)
    }
}