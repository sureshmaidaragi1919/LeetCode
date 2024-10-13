package com.mobile.leetcode.thirtdaysplan


var result = ""

private fun main() {

    var root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    println(sumNumbers(root))
}

fun sumNumbers(root: Node?): Int {

    return sumNumberss(root)
}

var finalSum = 0
fun findSumNumbers(root: Node?, index: Int, result: IntArray): Int {

    if (root == null) return finalSum

    result[index] = root.data as Int

    if (root?.left == null && root?.right == null) {
        var s = ""
        for (i in 0 .. index) {
            s += result[i]
        }
        finalSum += s.toInt()
    }


    findSumNumbers(root?.left, index + 1, result)

    findSumNumbers(root?.right, index + 1, result)

    return finalSum
}
    private fun helper(root: Node?, tempSum: Int): Int {
        var tempSum = tempSum
        if (root == null) {
            return 0
        }
        tempSum = tempSum * 10 + root.data as Int
        return if (root.left == null && root.right == null) {
            tempSum
        } else helper(root.left, tempSum) + helper(root.right, tempSum)
    }

   private fun sumNumberss(root: Node?): Int {
        return helper(root, 0)
    }

