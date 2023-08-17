package com.mobile.leetcode.tree


private fun main() {

    val root = Node(-10)
    root.left = Node(9)
    root.right = Node(20)
    root.right?.left = Node(15)
    root.right?.right = Node(7)
    findMaxPathSum(root)
    println("Maximum path sum is $max")
}

private var max = 0
private fun findMaxPathSum(root: Node?): Int {

    if (root == null) {
        return 0
    }

    val lc = findMaxPathSum(root.left)
    val rc = findMaxPathSum(root.right)

    max = Math.max(max, lc + rc + root.data.toString().toInt())
    return root.data.toString().toInt() + Math.max(lc, rc)
}
