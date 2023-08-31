package com.mobile.leetcode.array


/*
* Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

Example

For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.

There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.

For a = [2, 2], the output should be solution(a) = 2;

For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.
* */



private fun main() {

    println(solution(mutableListOf(2, 1, 3, 5, 3)))
}

fun solution(a: MutableList<Int>): Int {

    var resultMap = mutableMapOf<Int, Int>()

    var result = -1
    var index = Int.MAX_VALUE

    for(i in a.indices){

        if(resultMap.containsKey(a[i])){

            index = Math.min(i,index)
            result = a[index]

        } else {

            resultMap[a[i]]=i
        }

    }

    println("index is $index and result is $result")


    if(index ==Int.MAX_VALUE){
        return -1
    }else{
        return result
    }



}


/*
With better approach
* */

fun solutionV(a: MutableList<Int>): Int {
    val search = mutableSetOf<Int>()
    for (value: Int in a) {
        if (value in search) (return value) else search.add(value)
    }
    return -1
}
