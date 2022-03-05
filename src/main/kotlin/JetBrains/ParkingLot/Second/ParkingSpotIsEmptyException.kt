package JetBrains.ParkingLot.Second

class ParkingSpotIsEmptyException(message: String = "Parking lot is empty.") : Exception(message) {
}