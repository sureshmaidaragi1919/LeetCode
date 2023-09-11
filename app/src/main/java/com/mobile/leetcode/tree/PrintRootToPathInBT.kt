package com.mobile.leetcode.tree

/*
*                             1
*                     2                3
*                4        5          8   9
*                       6   7
*
* find common ancestor in above binary tree LCA (4, 7) == 2
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

    val array = Array<Any>(10, init = { 0 })
    printRootToPath(root, array, 0)
}

private fun printRootToPath(root: Node?, array: Array<Any>, index: Int) {
    if (root == null) return

    array[index] = root.data
    if (root.left == null && root.right == null) {
        printArrayWithRoot(root, array, index)
        println()
    }

    printRootToPath(root.left, array, index + 1)
    printRootToPath(root.right, array, index + 1)
}

private fun printArrayWithRoot(root: Node, array: Array<Any>, index: Int) {

    for (i in 0..index) {
        print(array[i])
    }
}

