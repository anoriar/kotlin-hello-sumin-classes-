package OOP.AnonymClassesPart1

fun main(args: Array<String>) {
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет")
        }

    })
}

fun travel(transport: Transport) {
    transport.drive()
}