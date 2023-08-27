package com.mobile.leetcode.tree

/*
*
*
*                   Binary Search Tree
*
*                       5
*               3               7
*          2        4       6       9

*       1                         8     10
*
*
* Input ^
*
* Target: 1
* Output : 2 Is InOrderSuccessor
*
*
** Target: 6
* Output : 7 Is InOrderSuccessor
*
*
* */


private fun main() {

    val root = MirrorBinaryTree.TreeNode(5)
    root.leftNode = MirrorBinaryTree.TreeNode(3)
    root.leftNode?.rightNode = MirrorBinaryTree.TreeNode(4)
    root.leftNode?.leftNode = MirrorBinaryTree.TreeNode(2)
    root.leftNode?.leftNode?.leftNode = MirrorBinaryTree.TreeNode(1)

    root.rightNode = MirrorBinaryTree.TreeNode(7)
    root.rightNode?.leftNode = MirrorBinaryTree.TreeNode(6)
    root.rightNode?.rightNode = MirrorBinaryTree.TreeNode(9)
    root.rightNode?.rightNode?.leftNode = MirrorBinaryTree.TreeNode(8)
    root.rightNode?.rightNode?.rightNode = MirrorBinaryTree.TreeNode(10)

    findInOrderPredecessor(root, MirrorBinaryTree.TreeNode(2))
    pot(root, 2)
    println("Using recursion $minv")
}

private fun findInOrderPredecessor(
        root: MirrorBinaryTree.TreeNode,
        target: MirrorBinaryTree.TreeNode
) {
    if (root == null) return
    if (root == target) {
        println(target.data)
        return
    }
    var temp: MirrorBinaryTree.TreeNode? = root
    var success = -1

    while (temp != null) {

        if (target.data >= temp.data) {
            temp = temp.rightNode
        } else {
            success = temp.data
            temp = temp.leftNode

        }

    }

    println("Using while loop $success")
}


private var minv = Int.MAX_VALUE
private fun pot(root: MirrorBinaryTree.TreeNode?, key: Int) {

    if (root == null) return

    if (root.data > key) {
        minv = root.data.coerceAtMost(minv)
    }

    pot(root.leftNode, key)
    pot(root.rightNode, key)

}
