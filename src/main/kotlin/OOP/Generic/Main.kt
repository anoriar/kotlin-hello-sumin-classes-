package OOP.Generic

fun main(args: Array<String>) {
    val myArrayList: MyArrayList<String> = MyArrayList()
    myArrayList.add("Test")
    myArrayList.add("Test2")
    myArrayList.add("Test3")
    myArrayList.remove("Test2")
    myArrayList.removeAt(0)
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }
    println(myArrayList.size())
}
