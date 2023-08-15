package com.mobile.leetcode.tree

/********************************************************
 *
 *                1
 *             /     \
 *            2       3
 *          /  \     /  \
 *        4     5   6    7
 *               \        \
 *                8        9
 *
 * O/P = 7
 * *******************************************************
 *
 *                1
 *             /     \
 *            2       3
 *                   /  \
 *                  6    7
 *                 /     \
 *                8       10
 *               /  \        \
 *              9    11      13
 *             /
 *           12
 *  O/P = 8
 *  * ****************************************************
 * Find diameter of binary tree
 *
 *  */
private fun main() {
    val root = Node(1)
    root.left = Node(2)
    root.right = Node(3)

    root.left!!.left = Node(4)
    root.left!!.right = Node(5)
    root.left!!.right!!.right = Node(8)

    root.right!!.left = Node(6)
    root.right!!.right = Node(7)
    root.right!!.right!!.right = Node(10)
    root.right!!.right!!.right!!.right = Node(13)


    println("Maximum depth is ${diameter(root)}")
    println("Maximum diameter is ${max}")

}

private var max = 0;
private fun diameter(root: Node?): Int {

    if (root == null) return 0

    val lh = diameter(root.left)
    val rh = diameter(root.right)

    max = max.coerceAtLeast(lh + rh)

    return 1+ lh.coerceAtLeast(rh)



}