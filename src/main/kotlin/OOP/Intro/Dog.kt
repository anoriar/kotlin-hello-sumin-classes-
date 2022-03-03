package OOP.Intro

class Dog {
    var name: String? = null
        get() {
            return field?.let {
                it.first().uppercase() + it.substring(1)
            }
        }

    var age: Int = 0
        set(value) {
            if (value < 0) {
                field = value
            }
        }

    var weight: Float = 0.0F
        set(value) {
            if (value < 0) {
                field = value
            }
        }

}