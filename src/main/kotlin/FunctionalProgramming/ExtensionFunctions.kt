package FunctionalProgramming

fun main(args: Array<String>) {
    val number = 4
    println(number.isPrimeNumber())

    val obj: String = "test"
    myWith(obj) {
        println(obj.length)
    }
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

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}