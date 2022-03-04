package JetBrains.ParkingLot.Second

val parkingSpots: MutableList<ParkingSpot> = mutableListOf()

class ParkingSpot(val number: Int, var car: Car?)
class Car(val number: String, val color: String)

fun main() {

    while (true) {
        val input: String = readLine() ?: ""
        val command: String = input.substringBefore(" ")
        val data = input.substringAfter(" ")

        when (command) {
            "create" -> create(data)
            "park" -> park(data)
            "leave" -> leave(data)
            "status" -> status()
            "exit" -> break
        }
    }
}

fun create(data: String): Unit {
    val spotCnt = data.toInt()
    parkingSpots.clear()
    val lastNumberSpot = ((findLastNumberSpot()?.number) ?: 0) + 1
    for (i in lastNumberSpot until lastNumberSpot + spotCnt) {
        parkingSpots.add(ParkingSpot(i, null))
    }

    println("Created a parking lot with $spotCnt spots.")
}


fun leave(data: String): Unit {
    val spotNumber = data.toInt()

    if (parkingSpots.isEmpty()) {
        println("Sorry, a parking lot has not been created.")
        return
    }

    val parkingSpot = findSpotByNumber(spotNumber)

    if (parkingSpot != null) {
        parkingSpot.car = null
        println("Spot $spotNumber is free.")
    }
}

fun park(data: String): Unit {
    val carNumber = data.substringBefore(" ")
    val carColor = data.substringAfter(" ")

    if (parkingSpots.isEmpty()) {
        println("Sorry, a parking lot has not been created.")
        return
    }

    val spot = findMinNumberEmptySpot()
    if (spot != null) {
        spot.car = Car(carNumber, carColor)
        println("$carColor car parked in spot ${spot.number}.")
    }else{
        println("Sorry, the parking lot is full.")
    }
}

fun findSpotByNumber(number: Int): ParkingSpot? {
    return parkingSpots.firstOrNull { it.number == number }
}

fun findLastNumberSpot(): ParkingSpot? {
    return parkingSpots.lastOrNull()
}

fun findMinNumberEmptySpot(): ParkingSpot? {
    return parkingSpots.firstOrNull() { it.car == null }
}

fun status() {
    if (parkingSpots.isEmpty()) {
        println("Sorry, a parking lot has not been created.")
        return
    }
    val notEmptySpots: List<ParkingSpot> = parkingSpots.filter { it.car != null }
    if (notEmptySpots.isEmpty()) {
        println("Parking lot is empty.")
    } else {
        for (spot in notEmptySpots) {
            println("${spot.number} ${spot.car?.number} ${spot.car?.color}")
        }
    }
}
