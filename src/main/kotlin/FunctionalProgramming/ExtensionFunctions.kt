package FunctionalProgramming

fun main(args: Array<String>) {
    val number = 4
    println(number.isPrimeNumber())
}

fun Int.isPrimeNumber(): Boolean {
    if (this == 1)
        return false

    for (j in 2 until this) {
        if (this % j == 0) {
            return false
        }
    }
    return true
}