package com.mobile.leetcode.thirtdaysplan

/*
Given the root of a Binary Search Tree (BST),
return the minimum absolute difference between the values of any two different nodes in the tree.


*
*Input: root = [4,2,6,1,3]
Output: 1
* */
class Node(var data: Any) {
    var left: Node? = null
    var right: Node? = null

}

private fun main() {
    val root = Node(4)
    root.left = Node(2)
    root.right = Node(6)
    root.left?.left = Node(1)
    root.left?.right = Node(3)

    println(findMinDiff(root))



}

var resultSum = ""
var output = 0
private fun findSum(root: Node?, arr: Array<String>, index: Int): String {

    if (root == null) return resultSum

    resultSum += root.data
    if (root.left == null && root.right == null) {
        println(resultSum)
        arr[index] = resultSum
    }
    findSum(root.left, arr, index + 1)
    findSum(root.right, arr, index + 1)

    return resultSum

}

private var min = Int.MAX_VALUE
private var prev = 0
private fun findMinDiff(root: Node?): Int {

    if (root == null) return min

    findMinDiff(root.left)

    if (prev != null) {
        min = Math.min(min, root.data as Int - prev)
    }

    if (root != null) {
        prev = root.data as Int
    }

    findMinDiff(root.right)

    return min

}

