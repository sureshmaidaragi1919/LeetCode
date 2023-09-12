package com.mobile.leetcode.numbersystem


/* Some pro tips on learning
* ------------------------
*  Operators
*  1010 and 1000 = 1000
*  1010 or 1000 = 1010
*  1010 xor 1000 = 0010
*
* compliment
*  1011 compliment 0100
*
* CONVERSIONS
* ------------------------
* Decimal to binary
* ------------------------
* (80) to convert binary keep dividing by 2 until remainder is 1 or zero and for result read numbers in reverse order
* (80) -> 1010000
*
*
* Binary to decimal
* ---------------------
* 1010-> 1*2P3+ 0*2P2 +1*2P1 + 0*2P0 = 8+0+2+0 = 10
*
*
* Decimal to Octal
* ---------------------
* 23 ->  23 % 8 -> 27
*
*
* Convert any format to other format
*
* Binary to octal
* (1011) in binary  ->(12) in decimal --> 13() In octal
*
*SHIFT OPERATORS
* ----------------
* Tips1: If you left shit a number by 1 it doubles always
* ex : 10010  << 100100
*
* Tip2: If you right shift a number by 1 it
*
*
*
* */

private fun main() {

    /*Left shift by digits*/
    println("left shift 4 by one digit = ${4 shl 1}")
    println("left shift 4 by two digit  = ${4 shl 3}")

    /* Right shift by one digit*/
    println("right shift 2 by one digit = ${2 shr 1}")


    /**/
    println("5 and 6 = ${5 and 6}")
    println("5 xor 6 = ${5 xor 6}")
    println("5 or 6 = ${5 ushr  6}")
    println("5 compliment= ${5.inc()}")

    println("Is 5 is odd? ${5 and 1}")
}