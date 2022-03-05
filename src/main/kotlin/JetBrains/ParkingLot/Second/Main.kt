package JetBrains.ParkingLot.Second

val parkingSpots: ParkingSpots = ParkingSpots()


fun main() {

    while (true) {
        val input: String = readLine() ?: ""
        val command: String = input.substringBefore(" ")
        val data = input.substringAfter(" ")
        try {
            when (command) {
                "create" -> create(data)
                "park" -> park(data)
                "leave" -> leave(data)
                "status" -> getNotFreeSpots()
                "exit" -> break
            }
        } catch (exception: Throwable) {
            println(exception.message)
        }

    }
}

fun create(data: String): Unit {
    val spotCnt = data.toInt()
    parkingSpots.create(spotCnt)
    println("Created a parking lot with $spotCnt spots.")
}


fun leave(data: String): Unit {
    val spotNumber = data.toInt()
    parkingSpots.leave(spotNumber)
    println("Spot $spotNumber is free.")
}

fun park(data: String): Unit {
    val carNumber = data.substringBefore(" ")
    val carColor = data.substringAfter(" ")

    val spotNumber = parkingSpots.park(Car(carNumber, carColor))
    println("$carColor car parked in spot ${spotNumber}.")
}

fun getNotFreeSpots() {
    for (spot in parkingSpots.getNotFreeSpots()) {
        println("${spot.key} ${spot.value.number} ${spot.value.color}")
    }
}
