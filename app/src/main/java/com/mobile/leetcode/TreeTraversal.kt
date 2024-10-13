package com.mobile.leetcode

/*
*
*                A
*             /     \
*            B       C
*          /  \     /  \
*        D     E   F    G
*
*
*
PreOderTraversal
 A B D E C F G
InOrderTraversal
 D B E A F C G
PostOrderTraversal
 D E B F G C A
* */
private class Node(var data: Any) {
    var left: Node? = null
    var right: Node? = null
}

private fun main() {
    val root = Node("A")
    root.left = Node("B")
    root.right = Node("C")
    root.left?.left = Node("D")
    root.left?.right = Node("E")
    root.right?.left = Node("F")
    root.right?.right = Node("G")
}


