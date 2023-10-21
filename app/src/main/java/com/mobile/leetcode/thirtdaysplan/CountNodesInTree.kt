package com.mobile.leetcode.thirtdaysplan

import com.mobile.leetcode.tree.Node

/*

*                         A
*                   B            C
*               D     E                  F
*                        G            H      I
*                                                 J
*
*
Input: root = [1,2,3,4,5,6]
Output: 6
*/


private fun main() {

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

    println(countNodes(root))
}


//With using return type
private fun countNodes(root: Node?): Int {
    if (root == null) return 0

    return 1 + countNodes(root.left) + countNodes(root.right)


}

//without using return type
private var count = 0
private fun goDFS(node: Node?) {
    if (node == null) return
    count++
    goDFS(node.left)
    goDFS(node.right)
}