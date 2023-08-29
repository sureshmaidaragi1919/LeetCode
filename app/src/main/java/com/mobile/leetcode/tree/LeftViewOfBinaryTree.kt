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
 * */

private fun main() {

    val root = MirrorBinaryTree.TreeNode(1)
    root.leftNode = MirrorBinaryTree.TreeNode(2)
    root.rightNode = MirrorBinaryTree.TreeNode(3)
    root.rightNode?.rightNode = MirrorBinaryTree.TreeNode(7)
    root.rightNode?.rightNode?.rightNode = MirrorBinaryTree.TreeNode(9)
    root.rightNode?.leftNode = MirrorBinaryTree.TreeNode(6)

    root.rightNode?.leftNode = MirrorBinaryTree.TreeNode(4)
    root.rightNode?.rightNode = MirrorBinaryTree.TreeNode(5)
    root.rightNode?.rightNode?.rightNode = MirrorBinaryTree.TreeNode(8)

    leftViewOfTree(root, 0)

    printResult()
}

private var dataList = mutableListOf<MirrorBinaryTree.TreeNode>()
private fun leftViewOfTree(root: MirrorBinaryTree.TreeNode?, level: Int) {
    if (root == null) return

    if (level == dataList.size) {
        dataList.add(root)
    }

    leftViewOfTree(root.leftNode, level + 1)
    leftViewOfTree(root.rightNode, level + 1)
}

private fun printResult() {
    for (i in dataList.indices) {
        println(dataList.get(i).data)
    }
}