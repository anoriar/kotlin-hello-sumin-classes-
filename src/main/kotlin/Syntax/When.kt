private var month: String = "Март"

fun main(args: Array<String>) {

    val season: String
    season = when (month) {
        "Март", "Апрель", "Май" ->{
            "Весна"
        }
        else -> {
            "Не найдено"
        }
    }
    println("Сезон: $season")

    val temp = 80
    val state = when {
        temp < 0 -> "Твердое"
        temp in 0..100 -> "Жидкое"
        else -> "Газообразное"

    }
    println("Сезон: $state")

    val time = 5
    val weatherIsGood = true
    val whatToDo = when {
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать книгу"
        else -> "Спать"

    }
    println("Сезон: $whatToDo")
}