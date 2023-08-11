package com.mobile.leetcode

import java.util.*


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
                 println("out put ${input[next_pointer]}")

             //   break
            }
            else stack.push(true)
        }else{
            if(stack.isNotEmpty()&&stack.pop()==true) {
                println("out put ${input[start_pointer]}")
               // break
            }
            else stack.push(false)
        }
         next_pointer++
         start_pointer++

         println(next_pointer)
     }

}