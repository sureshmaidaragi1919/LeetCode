package com.mobile.leetcode.tree

import java.util.LinkedList
import java.util.Queue


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

            val root = Node("A")
            root.left = Node("B")
            root.right = Node("C")

            root.left?.left = Node("d")
            root.left?.right = Node("E")
            root.left?.right?.left = Node("g")

            root.right?.right = Node("F")
            root.right?.right?.right = Node("I")
            root.right?.right?.left = Node("h")
            root.right?.right?.right?.left = Node("j")
            levelOrderTraverse(root)

        }


        private fun levelOrderTraverse(root: Node) {
            val queue: Queue<Node?> =
                LinkedList<Node?>()
            var tempNode: Node?
            queue.offer(root)

            while (queue.isNotEmpty()) {
                tempNode = queue.poll()

                if (tempNode != null && tempNode.left == null && tempNode.right == null) {
                    print(tempNode.data)

                } else {
                    queue.add(tempNode?.left)
                    queue.add(tempNode?.right)
                }


            }

        }
    }
}