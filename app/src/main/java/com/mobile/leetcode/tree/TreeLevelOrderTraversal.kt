package com.mobile.leetcode.tree

import java.util.LinkedList
import java.util.Queue

/*
*                         A
*                   B            C
*               D     E                  F
*                        G            H      I
*                                                 J
*
*
* */
class TreeLevelOrderTraversal {

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val root = Node("A")
            root.left = Node("B")
            root.right = Node("C")

            root.left?.left = Node("D")
            root.left?.right = Node("E")
            root.left?.right?.left = Node("G")

            root.right?.right = Node("F")
            root.right?.right?.right = Node("I")
            root.right?.right?.left = Node("H")
            root.right?.right?.right?.left = Node("J")
            levelOrderTraverse(root)

        }


        private fun levelOrderTraverse(root: Node) {
            val queue: Queue<Node?> = LinkedList<Node?>()
            var tempNode: Node?
            queue.offer(root)

            while (queue.isNotEmpty()) {
                tempNode = queue.poll()
                print(tempNode?.data)
                if (tempNode?.left != null) queue.add(tempNode.left)
                if (tempNode?.right != null) queue.add(tempNode.right)

            }

        }
    }
}