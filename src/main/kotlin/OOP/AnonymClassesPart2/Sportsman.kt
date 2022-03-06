package OOP.AnonymClassesPart2

class Sportsman {

    fun callWater(waterCarrier: WaterCarrier) {
        waterCarrier.bringWater()
    }

    fun callWater(action: () -> Unit) {
        action()
    }
}