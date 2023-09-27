package com.mobile.leetcode.tree

import java.util.LinkedList

/*
*
* 100. Same Tree
Solved
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value*/
private fun main() {

    var p = Node(1)
    p.left = Node(2)
    p.right = Node(3)

    var q = Node(1)
    q.left = Node(2)
    q.right = Node(4)
    println(areIdentical(p, q))
}

fun isSameTree(p: Node?, q: Node?): Boolean {

    if (p == null && q == null) return true
    if (p == null && q != null || p != null && q == null) return false

    var queue = LinkedList<Node?>()
    queue.add(p)

    var queue1 = LinkedList<Node?>()
    queue1.add(q)


    while (queue.isNotEmpty() && queue1.isNotEmpty()) {
        var m = queue.poll()
        var m1 = queue1.poll()
        if (m?.data != m1?.data || (m != null && m1 == null || m == null && m1 != null)) {
            return false
        } else {
            m?.let {
                queue.add(m.left)
                queue.add(m.right)
            }
            m1?.let {
                queue1.add(m1.left)
                queue1.add(m1.right)
            }

        }
    }

    return true

}

//Using recursion

private fun areIdentical(p: Node?, q: Node?): Boolean {

    if (p == null && q==null) return true
    if (p?.data != q?.data) return false

    return areIdentical(p?.left, q?.left) && areIdentical(p?.right, q?.right)

}