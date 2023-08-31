package com.mobile.leetcode.linkedlist

/*Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in real data you will be given a head node l of the linked list

Example

For l = [0, 1, 0], the output should be
solution(l) = true;

For l = [1, 2, 2, 3], the output should be
solution(l) = false.
*/

private fun main() {
    var head: LList.Node? = null

    head = LList.Node(5)
    head.next = LList.Node(10)
    head.next!!.next = LList.Node(20)
    head.next!!.next!!.next = LList.Node(30)
    head.next!!.next!!.next!!.next = LList.Node(40)
    println(solution(head))
}


/*Solution using extra space of list O(n) */
private fun solution(l: LList.Node?): Boolean {
    if (l == null || l.next == null) {
        return true
    } else {
        val list = mutableListOf<Int?>()
        var current: LList.Node? = l
        do {
            if (current != null) {
                list.add(current.data)
                current = current.next
            }

        } while (current != null)

        current = l
        for (i in list.size - 1 downTo list.size / 2) {
            var currentValue = list[i]
            if (current != null) {
                if (current.data != currentValue) {
                    return false
                }
                current = current.next
            }
        }
        return true
    }
}


/*Solution using extra space of stack O(n) */

private fun solutionV(l: LList.Node?) {


}

