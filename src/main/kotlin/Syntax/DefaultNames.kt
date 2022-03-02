import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    println(square(a = 10))
    println(square(a = 10, b = 20))
    println(square(a = 10, b = 3, c = 4))
    println(square2(a = 10))
}

fun square(a: Int, b: Int? = null, c: Int? = null) = when { b != null && c != null -> a * b * c; c == null && b != null -> a * b * a; else -> a * a *a }
fun square2(a: Int, b: Int = a, c: Int = a) = a * b * c
