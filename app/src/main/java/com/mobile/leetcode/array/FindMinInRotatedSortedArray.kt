package com.mobile.leetcode.array

import java.util.Stack


fun main(){

    val input1 = arrayOf(0,1,2,3,4,5,)
    val input = arrayOf(3,4,5,0,1,2)

    var start_pointer = 0
    var next_pointer = 1
    var size  = input.size
    val stack = Stack<Boolean>()

     while (next_pointer<size){

        if(input[start_pointer]>input[next_pointer]){
            if(stack.isNotEmpty()&&stack.pop()==false) {
                 println("output ${input[next_pointer]}")

             //   break
            }
            else stack.push(true)
        }else{
            if(stack.isNotEmpty()&&stack.pop()==true) {
                println("output ${input[start_pointer]}")
               // break
            }
            else stack.push(false)
        }
         next_pointer++
         start_pointer++

         println(next_pointer)
     }

}