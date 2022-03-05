package JetBrains.ParkingLot.Second

class ParkingIsFullException(message: String = "Sorry, the parking lot is full.") : Exception(message) {
}