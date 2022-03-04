package OOP.Enum

import OOP.Enum.Month.*
import OOP.Enum.Season.*


fun main(args: Array<String>) {

    val month = JANUARY

    val season = when (month) {
        JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY -> WINTER
    }

    println(season)
    println(month.temp)
}

