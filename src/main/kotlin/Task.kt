// Task 1
fun main() {

    println(commission(currentAmount = 10_000_00, cardType = "Maestro", lastAmount = 100_000_00))

}

fun commission(cardType: String = "Vk Pay", lastAmount: Int = 0, currentAmount: Int): Int {

    val commission = when (cardType) {
        "Mastercard", "Maestro" -> {
            when (lastAmount) {
                in 0..75_000_00 -> 0
                else -> currentAmount * 60 / 10_000 + 20_00
            }
        }
        "Visa", "Мир" -> {
            when {
                currentAmount * 75 / 10_000 > 35 -> currentAmount * 75 / 10_000
                else -> 35
            }
        }
        "Vk Pay" -> 0
        else -> 0
    }
    return commission
}