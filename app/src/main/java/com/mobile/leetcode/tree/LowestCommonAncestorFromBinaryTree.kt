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

    val root =  Node(1)
    root.left = Node(2)
    root.right = Node(3)

    root.right?.left = Node(8)
    root.right?.right = Node(9)
    root.left?.right = Node(5)
    root.left?.left = Node(4)
    root.left?.right?.right = Node(7)
    root.left?.right?.left = Node(6)

    println("Found ${findLowestCommonAncestor(root, Node(4), Node(7))?.data}")
}

fun findLowestCommonAncestor(root: Node?, p: Node, q: Node): Node? {

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
