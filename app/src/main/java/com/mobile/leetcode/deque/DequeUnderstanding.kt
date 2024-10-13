package com.mobile.leetcode.deque



/*
*
* a Deck or Double Ended queue is simple data structure, which is combination of stack and queue
* wherein elements can accessed/deleted on both the ends. i.e front front as well as from rear
*
* How the process works
*
* //say we have index f pointing to front for deck and r point to rear deck
* Insert from front
* [][2][3][] this is double ended queue
*
* f pointing to f=1 and rear pointing to r ==2
* f-- and r remains
* o/p [4][2][3][] f=0, r=2
*
* Delete from from front
* [4][2][3][]
* f++ and r remains
* o/p
*
*
*
*
* */
fun main() {

    val deck = ArrayDeque<Int>()

    deck.addFirst(8)
    deck.addFirst(6)
    deck.add(1)
    deck.addLast(5)
    deck.add(2)
    deck.add(3)
    deck.add(4)


    for (item in deck.iterator()) {
        println(item)
    }
    println("Before remove _-----")
    println(deck.removeFirst())
    println(deck.removeLast())

}