fun main(args: Array<String>) {
    val amount = 1000
    val commission = amount * 0.0075f
    val minimumCommission = 35
    val transferCommission = if (commission < minimumCommission) minimumCommission else commission
    println("Transfer Commission: ${transferCommission.toInt()}" + " Руб.")
}