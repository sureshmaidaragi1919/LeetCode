package com.mobile.leetcode.tree

import java.util.Stack


/*
*                             1
*                     2                3
*                4        5          8   9
*                       6   7
*
*
*
* */


private fun main() {

    val root = Node(1)
    root.left = Node(2)
    root.right = Node(3)

    root.right?.left = Node(8)
    root.right?.right = Node(9)
    root.left?.right = Node(5)
    root.left?.left = Node(4)
    root.left?.right?.right = Node(7)
    root.left?.right?.left = Node(6)

    val stack: Stack<Any?> = Stack()

    printPath(root, 7, stack)

    println(stack.toList().toString())

}

private fun printPath(root: Node?, data: Int, stack: Stack<Any?>): Boolean {

    if (root == null) return false

    stack.add(root.data)

    if (root.data==data) return true

    if (printPath(root.left,data,stack) || printPath(root.right,data,stack)) return true

    stack.pop()
    return false
}