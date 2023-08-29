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
 *                o/p = 1 3 7 9
 *
 * */

private fun main() {
    val root = MirrorBinaryTree.TreeNode(1)
    root.leftNode = MirrorBinaryTree.TreeNode(2)
    root.rightNode = MirrorBinaryTree.TreeNode(3)
    root.rightNode?.rightNode = MirrorBinaryTree.TreeNode(7)
    root.rightNode?.rightNode?.rightNode = MirrorBinaryTree.TreeNode(9)
    root.rightNode?.leftNode = MirrorBinaryTree.TreeNode(6)

    root.leftNode?.leftNode = MirrorBinaryTree.TreeNode(4)
    root.leftNode?.rightNode = MirrorBinaryTree.TreeNode(5)
    root.leftNode?.rightNode?.rightNode = MirrorBinaryTree.TreeNode(8)

    rightViewOfTree(root, 0)

    printResult()
}

private var resultList = mutableListOf<MirrorBinaryTree.TreeNode>()
private fun rightViewOfTree(root: MirrorBinaryTree.TreeNode?, level: Int) {

    if (root == null) return

    if (level == resultList.size) {
        resultList.add(root)
    }
    rightViewOfTree(root.rightNode, level + 1)
    rightViewOfTree(root.leftNode, level + 1)

}

private fun printResult() {
    for (i in resultList.indices) {
        println(resultList.get(i).data)
    }
}