package OOP.Constructor

fun main(args: Array<String>) {

    val employee: Employee = Employee("test", "dir", 1990)
    employee.printInfo()

}

fun Employee.printInfo(): Unit {
    println("Имя: ${this.name} Должность: ${this.position} Год: ${this.year} Стаж: ${this.experience}")
}