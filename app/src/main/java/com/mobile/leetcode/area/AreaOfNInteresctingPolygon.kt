package com.mobile.leetcode.area

/*

Ref vidoe: https://www.youtube.com/watch?v=zKrDTVsQ-F4&t=796s
https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ

Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.



Example

For n = 2, the output should be
solution(n) = 5;
For n = 3, the output should be
solution(n) = 13.*/

private fun main() {

    val n = 3
    println(n * n + ((n - 1) * (n - 1)))
}