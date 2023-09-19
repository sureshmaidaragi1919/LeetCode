package com.mobile.leetcode.thirtdaysplan


private fun main(){

    fun hammingWeight(n:Int):Int {

        var result  =0
        for( i in 0..n.toString().length){
            if(i ==1){
                result++
            }
        }
        return result
    }
}