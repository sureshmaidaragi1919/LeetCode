package com.mobile.leetcode


/*
* Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
* You may assume all four edges of the grid are all surrounded by water.
*
*
* Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
* */

fun main() {
    val grid = arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0')
    )

    print("Number of islands " + numIslands(grid))
}

fun numIslands(grid: Array<CharArray>): Int {

    var count = 0;

    for (i in grid.indices) {

        for (j in grid[i].indices) {

            if (grid[i][j] == '1') {

                count += 1

                callBFS(grid, i, j)
            }
        }
    }

    return count

}

fun callBFS(grid: Array<CharArray>, i: Int, j: Int) {

    if (i < 0 || i >= grid.size || j < 0 || j >= grid.size || grid[i][j] == '0')
        return

    grid[i][j] = '0'
    callBFS(grid, i + 1, j) //up
    callBFS(grid, i - 1, j) //down
    callBFS(grid, i, j + 1) //right
    callBFS(grid, i, j - 1) //left
}