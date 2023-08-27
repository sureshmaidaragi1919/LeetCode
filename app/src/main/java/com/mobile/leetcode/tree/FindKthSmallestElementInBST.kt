package com.mobile.leetcode.tree/*
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

 */

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

    kthSmallestTree(root)
    val k = 2
    // println("K = $k ,sorted array is $array, output is $k th largest element is ${array[k - 1]}")
    kthSmallestElementInTree(root, k)
    println("$result")
}

private var array = mutableListOf<Int>()
private var count = 0

/*

Using brute force apprach and inorder traversal
TC : O(Hight of BST)
SC : O(H)
* */

private fun kthSmallestTree(root: MirrorBinaryTree.TreeNode?) {

    if (root == null) return

    kthSmallestTree(root.leftNode)
    array.add(count++, root.data)
    kthSmallestTree(root.rightNode)
}

/*Using inorder and restricting it by kth time
* used extra variable can be done without that also
* */


private var countV1 = 0
private var result = 0
private fun kthSmallestElementInTree(root: MirrorBinaryTree.TreeNode?, k: Int) {

    if (root == null) return

    kthSmallestElementInTree(root.leftNode,k)
    if (countV1 < k) {
        countV1++
        result = root.data
    }
    kthSmallestElementInTree(root.rightNode,k)

}



