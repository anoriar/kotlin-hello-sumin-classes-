package OOP.EqualsAndDataClass

fun main(args: Array<String>) {

    val addressData: AddressData = AddressData("Yaroslavl", "Test", 10)
    val addressData2 = addressData.copy()
    val (city, street, house) = addressData
    println(addressData)
    println(addressData2)
    println(addressData.hashCode())
    println(addressData2.hashCode())
    println(addressData == addressData2)
    println(addressData === addressData2)
    println("$city, $street, $house")

    val address: Address = Address("Yaroslavl", "Test", 10)
    val address2 = address.copy(address.component1(), address.component2(), address.component3())
    val (city1, street1, house1) = address
    println(address)
    println(address2)
    println(address.hashCode())
    println(address2.hashCode())
    println(address == address2)
    println(address === address2)
    println("$city, $street, $house")
}

