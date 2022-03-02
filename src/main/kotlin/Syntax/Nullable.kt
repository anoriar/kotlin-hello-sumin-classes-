
private var name: String? = null
private var str1: String? = null
private var str2: String? = null
private var str3: String? = null

fun main(args: Array<String>) {
    val nameStrLength: String? = name?.length?.toString()
    println(nameStrLength)

    val nameIntLength: Int = name?.length?:0
    println(nameIntLength)


    println((str1?.length?:0) + (str2?.length?:0) + (str3?.length?:0))
}