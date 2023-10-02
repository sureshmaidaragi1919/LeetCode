package com.mobile.leetcode.tree

/*
*
*                A
*             /     \
*            B       C
*          /  \     /  \
*        D     E   F    G
* */

class Node(var data: Any) {
    var left: Node? = null
    var right: Node? = null
}

class TreeDs {

    var root: Node? = null

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val tree = TreeDs()
            tree.root = Node("A")
            tree.root?.left = Node("B")
            tree.root?.right = Node("C")
            tree.root?.left?.left = Node("D")
            tree.root?.left?.right = Node("E")
            tree.root?.right?.left = Node("F")
            tree.root?.right?.right = Node("G")


            println("PreOderTraversal")
            printPreOrder(tree.root!!)
            println()
            println("InOrderTraversal")
            printInOrder(tree.root!!)
            println()
            println("PostOrderTraversal")
            printPostOrder(tree.root!!)

        }

        private fun printPreOrder(node: Node?) {

            if (node == null) return

            print(" ${node.data}")
            printPreOrder(node.left)
            printPreOrder(node.right)

        }

        private fun printInOrder(node: Node?) {
            if (node == null) return

            printInOrder(node.left)
            print(" ${node.data}")
            printInOrder(node.right)

        }

        private fun printPostOrder(node: Node?) {
            if (node == null) return
            printPostOrder(node.left)
            printPostOrder(node.right)
            print(" ${node.data}")

        }


    }
}
