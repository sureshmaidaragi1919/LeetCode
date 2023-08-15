package com.mobile.leetcode.tree


/*
*
*                1
*             /     \
*            2       3
*          /  \     /  \
*        4     5   6    7
*               \
*                8
*
* O/P = 4
*
* when you are not happy with what you have, if simple pain/pressure comes on you.. you'll started feeling big pain on your ass
* */
private fun main() {

    val root = Node(1)
    root.left = Node(2)
    root.right = Node(3)

    root.left!!.left = Node(4)
    root.left!!.right = Node(5)
    root.left!!.right!!.right = Node(8)

    root.right!!.left = Node(6)
    root.right!!.right = Node(7)


    println("Maximum depth is ${findMaxDepth(root)}")


}

fun findMaxDepth(root: Node?): Int {

    if (root == null) return 0

    val leftCount = findMaxDepth(root.left)
    val rightCount = findMaxDepth(root.right)

    return (1 + leftCount.coerceAtLeast(rightCount))
}

