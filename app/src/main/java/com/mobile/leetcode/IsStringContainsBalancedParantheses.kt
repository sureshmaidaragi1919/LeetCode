package com.mobile.leetcode

import java.util.Stack


/*
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example:

Input: exp = “[()]{}{[()()]()}”
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])”
Output: Not Balanced
Explanation: 1 and 4 brackets are not balanced because
there is a closing ‘]’ before the closing ‘(‘
*
* */
private fun main() {
    val input = "[()]{}{[()()]()}"

    isValidString(input)
}

fun isValidString(input: String) {

    val stack = Stack<Char>()

    for (char in input) {

        if (char == '(' || char == '{' || char == '[') {
            stack.push(char)
        } else {
            if (stack.isEmpty()) {
                println("False")
                break
            }

            when (char) {
                ')' -> {
                    val item = stack.pop()
                    if (item == '{' || item == '[') {
                        println("False")
                        break
                    }
                }

                ']' -> {
                    val item = stack.pop()
                    if (item == '{' || item == '(') {
                        println("False")
                        break
                    }
                }

                '}' -> {
                    val item = stack.pop()
                    if (item == '(' || item == '[') {
                        println("False")
                        break
                    }
                }
            }
        }
    }

    println(stack.isEmpty())
}
