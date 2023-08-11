package com.mobile.leetcode


fun main() {

    var minimumPrice = Integer.MAX_VALUE
    var maxProfit = 0
    val stocks = arrayOf(100, 80, 120, 130, 70, 60, 100, 125)

    for (i in 0 until stocks.size) {
        maxProfit = Math.max(maxProfit, stocks[i] - minimumPrice) //50
        minimumPrice = Math.min(minimumPrice, stocks[i])  //80
    }

    println("fucked $maxProfit")
}