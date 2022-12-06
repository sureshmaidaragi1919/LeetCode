package com.mobile.leetcode

class NAryTreeTraversal {

    class NAryTreeNode(var data: Int) {
        var childern: List<NAryTreeNode>? = null
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val node = NAryTreeNode(1)
            val child1 = NAryTreeNode(2)
            child1.childern = listOf(NAryTreeNode(22), NAryTreeNode(23), NAryTreeNode(24))
            val child2 = NAryTreeNode(3)
            child2.childern = listOf(NAryTreeNode(32), NAryTreeNode(33), NAryTreeNode(34))
            val child3 = NAryTreeNode(4)
            child3.childern = listOf(NAryTreeNode(42), NAryTreeNode(43), NAryTreeNode(44))
            node.childern = listOf(child1, child2, child3)


            traverseNaryTree(node)
        }


       private fun traverseNaryTree(root: NAryTreeNode?) {

            if (root == null) {
                return
            }

            println(root.data)

            val size =   if (root.childern == null) {
                0
            } else {
                root.childern!!.size
            }

            for (i in 0 until size) {
                traverseNaryTree(root.childern?.get(i))
            }
        }
    }
}