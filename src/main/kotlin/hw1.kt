fun main() {
    val amount = 1 // стоимость текущей продажи
    val total = 500 // сумма предыдущих продаж
    val fee : Int = calculateFee(amount, total)  // exclusive по умолчанию = false

    println(fee) // 40
}


fun calculateFee(amount : Int, total : Int, exclusive : Boolean = false) : Int {
    var fee = when (total) { //величина комиссии в процентах
        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        else -> 15
    }
    if (exclusive) fee -=5 //итоговая величина комиссии в процентах
    return (amount*fee/100)
}