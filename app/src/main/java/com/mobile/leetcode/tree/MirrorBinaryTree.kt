package com.mobile.leetcode.tree

import java.util.LinkedList
import java.util.Queue


/*        Left Mirror                    Original                        Right Mirror
*              1                              1                                    1
*
*        3        2             <        2        3          >                3         2
*
*     7   6     5     4              4     5    6    7                   7     6     5    4
*
*
* */

internal class MirrorBinaryTree {

    internal class TreeNode(var data: Int) {
        var leftNode: TreeNode? = null
        var rightNode: TreeNode? = null
    }

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val tree = TreeNode(1)
            tree.leftNode = TreeNode(2)
            tree.rightNode = TreeNode(3)

            tree.leftNode?.leftNode = TreeNode(4)
            tree.leftNode?.rightNode = TreeNode(5)

            tree.rightNode?.leftNode = TreeNode(6)
            tree.rightNode?.rightNode = TreeNode(7)

        // mirrorTree(tree)

            levelOrderTraversalTree(tree)
        }


        private fun mirrorTree(root: TreeNode?) {
            if (root == null) return
            else {
                var temp: TreeNode? = null
                mirrorTree(root.leftNode)
                mirrorTree(root.rightNode)

                temp = root.leftNode
                root.leftNode = root.rightNode
                root.rightNode = temp
            }
        }


        private fun levelOrderTraversalTree(root: TreeNode?) {

            var queue: Queue<TreeNode> = LinkedList()
            queue.offer(root)
            var temp: TreeNode? = null
            while (queue.isNotEmpty()) {

                temp = queue.poll()
                print("${temp?.data}  ")

                if (temp.leftNode != null) queue.offer(temp.leftNode)
                if (temp.rightNode != null) queue.offer(temp.rightNode)
            }

        }
    }


}