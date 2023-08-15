package com.mobile.leetcode.tree


fun main() {


    /*
    *                             1
    *                     2                3
    *                4        5          8   9
    *                       6   7
    *
    * find common ancestor in above binary tree LCA (4, 7) == 2
    *
    * */

    val root = TreeDs.Node(1)
    root.left = TreeDs.Node(2)
    root.right = TreeDs.Node(3)

    root.right!!.left = TreeDs.Node(4)
    root.right!!.left!!.left = TreeDs.Node(8)
    root.right!!.right = TreeDs.Node(5)
    root.right!!.right!!.left = TreeDs.Node(6)
    root.right!!.right!!.right = TreeDs.Node(7)



    println("Found ${findLowestCommonAncestor(root, TreeDs.Node(7), TreeDs.Node(8))!!.data}")
}

fun findLowestCommonAncestor(root: TreeDs.Node?, p: TreeDs.Node, q: TreeDs.Node): TreeDs.Node? {

    if (root == null || root.data == p.data || root.data == q.data) {
        return root
    }

    val left = findLowestCommonAncestor(root.left, p, q)
    val right = findLowestCommonAncestor(root.right, p, q)

    return if (left == null) {
        right
    } else if (right == null) {
        left
    } else {
        root
    }

}
