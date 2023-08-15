package com.mobile.leetcode.tree

/*
* LinkedList  1 2 3 4 5 6
*  ProderTraversal tree = 1 2 4 5 3 6
*
*              1
*          /       \
*       2            3
*     /   \         /
*  4       5      6
*
* */

class ConvertLinkedListToBinaryTree {


    class TreeNode(var data: Int?) {
        var leftNode: TreeNode? = null
        var rightNode: TreeNode? = null
    }

    class LListNode(var data: Int?) {
        var next: LListNode? = null
    }


    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            var head = LListNode(1)
            head.next = LListNode(2)
            head.next?.next = LListNode(3)
            head.next?.next?.next = LListNode(4)
            head.next?.next?.next?.next = LListNode(5)
            head.next?.next?.next?.next?.next = LListNode(6)
            var root = convertLinkedListToBinaryTree(TreeNode(0), head)

            printTreePreOderTraversal(root)
        }

        fun printTreePreOderTraversal(root: TreeNode?) {

            if (root != null) {
                println(root.data)
                printTreePreOderTraversal(root.leftNode)
                printTreePreOderTraversal(root.rightNode)
            }
        }


        fun convertLinkedListToBinaryTree(root: TreeNode?, head: LListNode?): TreeNode? {

            var root = root
            var head = head
            if (head == null) {
                root = null
                return root
            }

            val queue = ArrayDeque<TreeNode>()
            root = TreeNode(head.data)
            queue.add(root)

            head = head.next

            while (head != null) {

                val parent = queue.removeFirst()
                var leftChild: TreeNode? = null
                var rightChild: TreeNode? = null

                leftChild = TreeNode(head.data)
                queue.add(leftChild)
                head = head.next
                if (head != null) {
                    rightChild = TreeNode(head.data)
                    queue.add(rightChild)
                }
                parent.leftNode = leftChild
                parent.rightNode = rightChild
                head = head?.next
            }

            return root

        }
    }

}