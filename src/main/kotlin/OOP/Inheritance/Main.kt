package OOP.Inheritance

fun main(args: Array<String>) {

    val languages: List<String> = listOf("Kotlin", "Java", "Scala")
    val employees: MutableList<Employee> = mutableListOf<Employee>()
    for (i in 0..20) {
        if (i % 2 == 0) {
            employees.add(Employee("Работник №$i", i))
        } else {

            employees.add(Developer("Работник №$i", i, languages[(languages.indices).shuffled().last()]))
        }
    }

    for (employee in employees) {
        employee.work()
    }
}
