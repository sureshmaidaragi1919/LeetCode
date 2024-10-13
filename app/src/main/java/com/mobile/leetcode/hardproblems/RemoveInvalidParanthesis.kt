package com.mobile.leetcode.hardproblems

import java.util.Stack

/*
https://leetcode.com/problems/remove-invalid-parentheses/description/

*/

fun isValid(s: String): Boolean {

    var stack = Stack<Char>()

    for(i in 0 until s.length){
        var c = s.get(i)
        if(c=='('||c=='['||c=='{'){
            stack.push(c)
        } else if(c!=stack.pop()){
            return false
        }
    }

return true

}