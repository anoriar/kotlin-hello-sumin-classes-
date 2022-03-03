package JetBrains.ParkingLot

val freeSpots: MutableList<Int> = (1..20).toMutableList()

//park YT-4F9-EJ Green
//leave 1
//exit
fun main() {
    while (true) {
        val input: String = readLine() ?: ""
        val command: String = input.substringBefore(" ")
        val data = input.substringAfter(" ")

        when (command) {
            "park" -> park(data)
            "leave" -> leave(data)
            "exit" -> break
        }
    }
}

fun leave(data: String): Unit {
    val spot = data.toInt()
    freeSpots.add(spot)
    println("Spot ${spot} is free.")
}

fun park(data: String): Unit {
    val color = data.substringAfter(" ")

    val spot = findSpot()
    if (spot != null) {
        freeSpots.removeAt(freeSpots.indexOf(spot))
        println("$color car parked in spot ${spot}.")
    } else {
        println("Sorry, the parking lot is full.")
    }

}

fun findSpot(): Int? {
    return freeSpots.minOrNull()
}
