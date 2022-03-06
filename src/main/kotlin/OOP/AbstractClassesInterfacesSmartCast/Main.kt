package OOP.AbstractClassesInterfacesSmartCast

fun main(args: Array<String>) {

    val languages: List<String> = listOf("Kotlin", "Java", "Scala")
    val employees: MutableList<Employee> = mutableListOf<Employee>()
    for (i in 0..10) {
        if (i % 2 == 0) {
            employees.add(Seller("Работник №$i", i))
        } else if (i % 3 == 0) {
            employees.add(Developer("Работник №$i", i, languages[(languages.indices).shuffled().last()]))
        } else {
            employees.add(Director("Работник №$i", i))
        }
    }

    for (employee in employees) {
        employee.work()
    }

    val cleaners = employees.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }
}
