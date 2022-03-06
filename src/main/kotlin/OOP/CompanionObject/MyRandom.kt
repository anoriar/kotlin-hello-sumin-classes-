package OOP.CompanionObject

class MyRandom {
    companion object {
        private const val MONDAY = "Пн"
        private const val TUESDAY = "Вт"
        private const val WEDNESDAY = "Ср"
        private const val THURSDAY = "Чт"
        private const val FRIDAY = "Пт"
        private const val SATURDAY = "Сб"
        private const val SUNDAY = "Вс"
        val booleans = listOf<Boolean>(true, false)
        val daysOfTheWeek = listOf<String>(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)

        fun getRandomNumberByRange(range: IntRange): Int {
            return range.random()
        }

        fun getRandomBoolean(): Boolean {
            return booleans.random()
        }

        fun getRandomWeekday(): String {
            return daysOfTheWeek.random()
        }
    }
}