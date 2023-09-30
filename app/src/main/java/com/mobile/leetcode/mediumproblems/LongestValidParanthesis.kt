package com.mobile.leetcode.mediumproblems

import java.util.Stack


/*https://leetcode.com/problems/longest-valid-parentheses/description/


Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
substring
.



Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0


 */

private fun main(){

    val input = ")()())"




}

private fun isValid(s: String): Boolean {

    if(s.isEmpty()||s.length==1){
        return false
    }


    var stack = Stack<Char>()
    var index = 0
    while(index<s.length){
        println(s[index])

        if(s[index]=='('||s[index]=='{'||s[index]=='[') {
            stack.push(s[index])
        }

        if(stack.isEmpty()&&(s[index]==')'||s[index]=='}'||s[index]==']')) return false

        if(s[index]==')'){

            if(stack.isNotEmpty()&&stack.peek()=='(')
                stack.pop()
            else
                stack.push(s[index])

        }


        if(s[index]=='}') {
            if(stack.isNotEmpty()&&stack.peek()=='{')
                stack.pop()
            else
                stack.push(s[index])


        }

        if(s[index]==']') {
            if(stack.isNotEmpty()&&stack.peek()=='[')
                stack.pop()
            else{
                stack.push(s[index])
            }

        }

        index ++
    }
    println(stack.size)

    return stack.isEmpty()
}