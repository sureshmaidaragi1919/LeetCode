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
* Output : -1 Is InOrderPredecessor
*
*
* Target : 4
* Output : 3 Is InOrderPredecessor
*
*
*
*
* */



fun main() {

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

    inOrderPredecessor(root, MirrorBinaryTree.TreeNode(8))
}


fun inOrderPredecessor(root: MirrorBinaryTree.TreeNode, target: MirrorBinaryTree.TreeNode) {

    if (root == null) {
        println("invalid case ")
        return
    }

    var temp: MirrorBinaryTree.TreeNode? = root
    var success = -1

    while (temp != null) {
        if (target.data > temp.data) {
            success = temp.data ?: -1
            temp = temp.rightNode
        } else {
            temp = temp.leftNode
        }
    }

    println(success)

}