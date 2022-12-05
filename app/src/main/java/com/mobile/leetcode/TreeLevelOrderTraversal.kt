package com.mobile.leetcode

import java.util.*

/*
*
* */
class TreeLevelOrderTraversal {

    class TreeNode(var data: String) {
        var leftNode: TreeNode? = null
        var rightNode: TreeNode? = null
    }


    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val root = TreeNode("A")
            root.leftNode = TreeNode("B")
            root.rightNode = TreeNode("C")

            root.leftNode?.leftNode = TreeNode("D")
            root.leftNode?.rightNode = TreeNode("E")
            root.leftNode?.rightNode?.leftNode = TreeNode("G")

            root.rightNode?.rightNode = TreeNode("F")
            root.rightNode?.rightNode?.rightNode = TreeNode("I")
            root.rightNode?.rightNode?.leftNode = TreeNode("H")
            root.rightNode?.rightNode?.rightNode?.leftNode = TreeNode("J")
            levelOrderTraverse(root)

        }


        private fun levelOrderTraverse(root: TreeNode) {
            val queue: Queue<TreeNode?> = LinkedList<TreeNode?>()
            var tempNode: TreeNode?
            queue.offer(root)

            while (queue.isNotEmpty()) {
                tempNode = queue.poll()
                print(tempNode?.data)
                if (tempNode?.leftNode != null) queue.add(tempNode.leftNode)
                if (tempNode?.rightNode != null) queue.add(tempNode.rightNode)

            }

        }
    }
}