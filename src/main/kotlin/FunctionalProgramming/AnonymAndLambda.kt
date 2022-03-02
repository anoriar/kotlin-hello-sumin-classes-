package FunctionalProgramming

import kotlin.math.*


fun main(args: Array<String>) {

    val square = { a: Int -> a * a }
    println(square(20))

    val perimeter = { a: Int, b: Int -> a * b }
    println(perimeter(2, 3))

    val printName: (String) -> Unit = { println(it) }
    printName("Alex")

    val sort: (ArrayList<Int>) -> ArrayList<Int> = {
        for(j in 1 until it.size){
            for(i in 0 until it.size - j){
                if(it[i] < it[i + 1]){
                    val tmp = it[i]
                    it[i] = it[i + 1]
                    it[i + 1] = tmp
                }
            }
        }
        it
    }

    println(sort(arrayListOf(2, 4, 6, 1, -9)))

}
