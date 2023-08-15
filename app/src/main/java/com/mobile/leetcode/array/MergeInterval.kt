package com.mobile.leetcode.array

import java.util.Stack

class MergeInterval {

    class Interval(val start: Int, val end: Int)


    companion object {

        private fun mergeIntervals(arr: Array<Interval>) {

            if (arr.isEmpty()) return

            var stack = Stack<Interval>()

            printItems(arr)
            stack.push(arr[0])

        }

        private fun printItems(arr: Array<Interval>) {
            for (item in arr) {
                println("${item.start}-${item.end}")
            }
        }


        @JvmStatic
        fun main(array: Array<String>) {
            val intervals = arrayOf(arrayOf(1, 3), arrayOf(2, 3), arrayOf(8, 10), arrayOf(15, 18))
            //sort array first
            var output_array = mutableListOf<Array<Int>>()


            var current_interval = intervals[0]
            output_array.add(current_interval)

            for (interval in intervals) {
                var current_begin = current_interval[0]
                var current_end = current_interval[1]
                var next_begin = interval[0]
                var next_end = interval[1]

                if (current_end >= next_begin) {
                    current_interval[1] = Math.max(current_end, next_end) //6

                } else {
                    current_interval = interval
                    output_array.add(current_interval)
                }
            }

          output_array.forEach{println(it.toList().toString())}
        }
    }
}