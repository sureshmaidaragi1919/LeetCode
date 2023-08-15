package com.mobile.leetcode.tree


/*
*
*                           1
*
*                  2           3               4
*
*             22  23  24    32   33   34    42  43  44
*
*
*
*  0/P  = 1 2 22 23 24 3 32 33 34 4 42 43 44
*
*
* */
class NAryTreeTraversal {

    class NAryTreeNode(var data: Int) {
        var children: List<NAryTreeNode>? = null
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val node = NAryTreeNode(1)
            val child1 = NAryTreeNode(2)
            child1.children = listOf(NAryTreeNode(22), NAryTreeNode(23), NAryTreeNode(24))
            val child2 = NAryTreeNode(3)
            child2.children = listOf(NAryTreeNode(32), NAryTreeNode(33), NAryTreeNode(34))
            val child3 = NAryTreeNode(4)
            child3.children = listOf(NAryTreeNode(42), NAryTreeNode(43), NAryTreeNode(44))
            node.children = listOf(child1, child2, child3)


            traverseNaryTree(node)
        }


        private fun traverseNaryTree(root: NAryTreeNode?) {

            if (root == null) {
                return
            }

            print("${root.data} ")

            val size = if (root.children == null) {
                0
            } else {
                root.children!!.size
            }

            for (i in 0 until size) {
                traverseNaryTree(root.children?.get(i))
            }
        }
    }
}