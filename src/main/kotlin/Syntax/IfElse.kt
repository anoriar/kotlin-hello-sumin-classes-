private var money: Int = 300

fun main(args: Array<String>) {

    val productName = if (money > 500) {
        money -= 500
        "Пицца"
    } else if (money > 200) {
        money -= 200
        "Шаурма"
    } else {
        money -= 30
        "Доширак"
    }
    println("Вы можете позволить себе ${productName.length}, $money")


}
