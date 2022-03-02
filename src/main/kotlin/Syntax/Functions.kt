import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    println(getFiveSubstring("testest"))
    println(sum(1,2,3,4,5))
    println(sort(80, 4, 3, -1, 1, 70))
}

fun getFiveSubstring(str: String) = str.substring(0, min(5, str.length))

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (num in numbers){
        sum += num
    }

    return sum
}

fun sort(vararg values: Int): List<Int> {

    for(j in 1 until values.size){
        for(i in 0 until values.size - j){
            if(values[i] > values[i + 1]){
                val tmp = values[i]
                values[i] = values[i + 1]
                values[i + 1] = tmp
            }
        }
    }

    return values.toList()
}