package OOP.Inheritance

import java.util.Calendar

open class Employee(val name: String, val age: Int) {

    open fun work() {
        println("Работаю...")
    }

}