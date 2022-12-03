package com.mobile.leetcode


internal class TreeDs {

    internal class Node(var data: Any) {
        var left: Node? = null
        var right: Node? = null
    }

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


            printPreOrder(tree.root!!)
        }

        private fun printPreOrder(node: Node?) {

            if (node == null) return

            print("${node.data}")
            printPreOrder(node.left)
            printPreOrder(node.right)

        }
    }
}
