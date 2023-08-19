package com.mobile.leetcode.queue

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue


/*
* Priority queue is like a regular queue elements are order in with the priority

* */
@RequiresApi(Build.VERSION_CODES.N)
private fun main() {
    primitiveTypesPQueue()
}

@RequiresApi(Build.VERSION_CODES.N)
private fun primitiveTypesPQueue() {
    val queue1: Queue<Int> = LinkedList() //Regular queue with insertion order maintained

    queue1.offer(10)
    queue1.offer(12)
    queue1.offer(9)
    queue1.offer(13)
    printQueue(queue1)
    println()

    val orderedQueue = PriorityQueue<Int>()  // priority with natural ordering

    orderedQueue.offer(10)
    orderedQueue.offer(12)
    orderedQueue.offer(9)
    orderedQueue.offer(13)

    printQueue(orderedQueue)
    println()

    val cartQueue = PriorityQueue<CartItems>(CustomerCartItemComparator())
    cartQueue.add(CartItems(id = 1, price = 100, date = 1L, title = "Cycle"))
    cartQueue.add(CartItems(id = 3, price = 520, date = 4L, title = "Book"))
    cartQueue.add(CartItems(id = 2, price = 300, date = 2L, title = "Table"))

    while (cartQueue.isNotEmpty()) {
        print("Cart queue is ${cartQueue.poll()} ")
    }


}

fun printQueue(queue: Queue<Int>) {
    while (queue.isNotEmpty()) {
        print("${queue.poll()} ")
    }
}

class CustomIntegerComparator : Comparator<Int> {
    override fun compare(o1: Int, o2: Int): Int {
        return if (o1 < o2) -1 else 1
    }
}

class CustomerCartItemComparator : Comparator<CartItems> {
    override fun compare(o1: CartItems, o2: CartItems): Int {
        return if (o1.id < o2.id) 1 else -1 //Descending order of id
    }
}

data class CartItems(
    val id: Int,
    val price: Int,
    val date: Long,
    val title: String
)