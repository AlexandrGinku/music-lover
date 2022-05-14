package ru.netology

fun main() {
    var purchase = 1001.00
    var totalPrice = purchase
    val userStatus = true
    var fixDiscount = purchase - 100.00
    var floatsDiscount = purchase * 0.95
    if (purchase >= 1001 && purchase <= 10000) {
        totalPrice = fixDiscount
        if (userStatus) totalPrice *= 0.99 else totalPrice
    } else if (purchase >= 10001) {
        totalPrice = floatsDiscount
        if (userStatus) totalPrice *= 0.99 else totalPrice
    } else {
        totalPrice = purchase
    }
    println("Сумма покупки $totalPrice")
}