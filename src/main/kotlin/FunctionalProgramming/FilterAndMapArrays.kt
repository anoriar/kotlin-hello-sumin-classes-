package FunctionalProgramming

fun main(args: Array<String>) {
//    val listOfNames = mutableListOf<String>("Alex", "Test", "Arseniy")
//
//    val aListOfNames = listOfNames.filter { it.first() == 'A' }
//    println(aListOfNames)

    val listOfNumbers: MutableList<Int> = mutableListOf<Int>()

    for (i in 0..1000) {
        listOfNumbers.add((0..1000).random())
    }
    val result = listOfNumbers.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { it.toString() }

    println(result)
}
