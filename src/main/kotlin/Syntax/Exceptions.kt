import java.util.*

fun main() {
    println(sum("1o", "2"))
}

fun sum(a: String, b: String): Int {
    val result = try {
        a.toInt() + b.toInt()
    } catch (e: Exception) {
        0
    }

    return result
}

