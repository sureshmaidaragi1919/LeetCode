package com.mobile.leetcode.thirtdaysplan

import com.mobile.leetcode.tree.Node


/*
https://leetcode.com/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150

112. Path Sum
Solved
Easy
Topics
Companies
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
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

    println(hasPathSum(root, targetSum = 13))
}

private fun hasPathSum(root: Node?, targetSum: Int): Boolean {

    return hasPathSum(root, targetSum, 0)

}

private fun hasPathSum(root: Node?, targetSum: Int, nodeSum: Int): Boolean {
    if (root == null) return false
    else if (root.left == null && root.right == null) return targetSum == nodeSum + root.data as Int
    return hasPathSum(root.left, targetSum, nodeSum + root.data as Int)
            || hasPathSum(root.right, targetSum, nodeSum + root.data as Int)
}