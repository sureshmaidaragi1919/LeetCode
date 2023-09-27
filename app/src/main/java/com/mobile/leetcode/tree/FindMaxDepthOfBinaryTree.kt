package com.mobile.leetcode.tree

import java.util.LinkedList


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
    println("Maximum depth is using level order traversal ${findMaxDepthLevelOrderTraversal(root)}")


}

private fun findMaxDepth(root: Node?): Int {

    if (root == null) return 0

    val leftCount = findMaxDepth(root.left)
    val rightCount = findMaxDepth(root.right)

    return (1 + leftCount.coerceAtLeast(rightCount))
}

private fun findMaxDepthLevelOrderTraversal(root: Node?): Int {


    var depth = 0

    if (root == null) return depth
    val queue = LinkedList<Pair<Node?, Int>>()

    queue.offer(Pair(root, 1))
    while (queue.isNotEmpty()) {
        val pair = queue.poll()
        pair.first?.let {
            depth = pair.second
            queue.add(Pair(it.left, depth + 1))
            queue.add(Pair(it.right, depth + 1))
        }

    }

    return depth

}

