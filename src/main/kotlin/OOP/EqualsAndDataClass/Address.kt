package OOP.EqualsAndDataClass

class Address(private val city: String, private val street: String, private val house: Int) {
    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = house

    fun copy(city: String, street: String, house: Int): Address {
        return Address(city, street, house)
    }

    override fun toString(): String {
        return "${this.javaClass.simpleName}(city=$city, street=$street, house=$house)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (house != other.house) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + house
        return result
    }
}