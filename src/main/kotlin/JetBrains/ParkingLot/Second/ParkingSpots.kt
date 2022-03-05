package JetBrains.ParkingLot.Second

class ParkingSpots {

    val parkingSpots: MutableMap<Int, Car?> = mutableMapOf()


    fun create(spotCnt: Int): Unit {
        parkingSpots.clear()
        val lastNumberSpot = (findLastSpotNumber() ?: 0) + 1
        for (i in lastNumberSpot until lastNumberSpot + spotCnt) {
            parkingSpots[i] = null
        }
    }


    fun leave(spotNumber: Int): Unit {
        if (parkingSpots.isEmpty()) {
            throw ParkingNotCreatedException()
        }

        if (parkingSpots[spotNumber] == null) {
            throw Exception("Spot $spotNumber not found")
        }

        parkingSpots[spotNumber] = null
    }

    fun park(car: Car): Int {
        if (parkingSpots.isEmpty()) {
            throw ParkingNotCreatedException()
        }

        var spotNumber: Int? = findMinNumberEmptySpot()
        if (spotNumber == null) {
            throw ParkingIsFullException()
        }
        parkingSpots[spotNumber] = car
        return spotNumber
    }

    fun findLastSpotNumber(): Int? {
        return parkingSpots.maxByOrNull { it.key }?.key
    }

    fun findMinNumberEmptySpot(): Int? {
        return parkingSpots.filter { it.value == null }.minByOrNull { it.key }?.key
    }

    fun getNotFreeSpots(): Map<Int, Car> {
        if (parkingSpots.isEmpty()) {
            throw ParkingNotCreatedException()
        }
        val notEmptySpots: Map<Int, Car> = parkingSpots.filter { it.value != null } as Map<Int, Car>
        if (notEmptySpots.isEmpty()) {
            throw ParkingSpotIsEmptyException()
        }
        return notEmptySpots
    }
}