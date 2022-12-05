package com.mobile.leetcode

import java.util.*


/*
*                         A
*                   B            C
*               d     E                  F
*                        g            h      I
*                                                 j
*
*               O/P    d ->j -> h- >j
* */
class PrintLeapNodesOfBinaryTree {


    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val root = TreeLevelOrderTraversal.TreeNode("A")
            root.leftNode = TreeLevelOrderTraversal.TreeNode("B")
            root.rightNode = TreeLevelOrderTraversal.TreeNode("C")

            root.leftNode?.leftNode = TreeLevelOrderTraversal.TreeNode("d")
            root.leftNode?.rightNode = TreeLevelOrderTraversal.TreeNode("E")
            root.leftNode?.rightNode?.leftNode = TreeLevelOrderTraversal.TreeNode("g")

            root.rightNode?.rightNode = TreeLevelOrderTraversal.TreeNode("F")
            root.rightNode?.rightNode?.rightNode = TreeLevelOrderTraversal.TreeNode("I")
            root.rightNode?.rightNode?.leftNode = TreeLevelOrderTraversal.TreeNode("h")
            root.rightNode?.rightNode?.rightNode?.leftNode = TreeLevelOrderTraversal.TreeNode("j")
            levelOrderTraverse(root)

        }


        private fun levelOrderTraverse(root: TreeLevelOrderTraversal.TreeNode) {
            val queue: Queue<TreeLevelOrderTraversal.TreeNode?> =
                LinkedList<TreeLevelOrderTraversal.TreeNode?>()
            var tempNode: TreeLevelOrderTraversal.TreeNode?
            queue.offer(root)

            while (queue.isNotEmpty()) {
                tempNode = queue.poll()

                if (tempNode != null && tempNode.leftNode == null && tempNode.rightNode == null) {
                    print(tempNode.data)

                } else {
                    queue.add(tempNode?.leftNode)
                    queue.add(tempNode?.rightNode)
                }


            }

        }
    }
}