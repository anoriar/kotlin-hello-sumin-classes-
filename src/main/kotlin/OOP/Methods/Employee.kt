package OOP.Methods

import java.util.Calendar

class Employee(val name: String, val position: String, val year: Int) {

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - year

    fun work() {
        println("Работаю...")
    }

}