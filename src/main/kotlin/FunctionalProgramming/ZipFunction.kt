package FunctionalProgramming

fun main(args: Array<String>) {
    val fullNamesInit: MutableList<String> = mutableListOf<String>()
    val nameList: MutableList<String> = mutableListOf<String>()
    val lastNameList: MutableList<String> = mutableListOf<String>()

    for(i in 1..1000){
        fullNamesInit.add("Имя$i Фамилия$i")
    }

    for (fullName in fullNamesInit){
        val splitted = fullName.split(" ")

        nameList.add(splitted[0])
        lastNameList.add(splitted[1])
    }

    val resultList = nameList.zip(lastNameList)

    println(resultList)
}