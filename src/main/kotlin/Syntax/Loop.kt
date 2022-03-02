
fun main(args: Array<String>) {

    val array: Array<Int?> = arrayOfNulls<Int?>(100)

    for(i in 0 until 100){
        array[i] = i + 1

    }

    for((index, i) in array.withIndex()){
        println("$index $i")
    }
}
