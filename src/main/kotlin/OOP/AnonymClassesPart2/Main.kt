package OOP.AnonymClassesPart2

fun main(args: Array<String>) {
    val sportsman = Sportsman()
    sportsman.callWater(object : WaterCarrier {
        override fun bringWater() {
            println("Вода принесена")
        }
    })

    sportsman.callWater { println("test") }
}

