package com.mobile.leetcode.graph


/*                                          1
                                        /       \
                                    2               3 -----4
                                /      \            |      |
                             5          6           7 ---- 8
*X
*
* */
private fun main() {

    val adjList = mutableMapOf<Int, MutableList<Int>>()

    adjList.put(1, mutableListOf(2, 3))
    adjList.put(2, mutableListOf(1, 5, 6))
    adjList.put(3, mutableListOf(1, 4, 7))
    adjList.put(4, mutableListOf(3, 8))
    adjList.put(5, mutableListOf(2))
    adjList.put(6, mutableListOf(2))
    adjList.put(7, mutableListOf(3, 8))
    adjList.put(8, mutableListOf(4, 7))

    val root = 0
    val visited = mutableListOf(false, false, false, false, false, false, false, false, false)
    visited[0] = true
    val result = mutableListOf<Int>()
    dfs(adjList, visited, root, result)
    println(result)
}

fun dfs(
        adjList: MutableMap<Int, MutableList<Int>>,
        visNode: MutableList<Boolean>,
        root: Int,
        result: MutableList<Int>
) {

    visNode[root] = true
    val adjItemsList = adjList.getValue(root)

    for (i in adjItemsList.indices) {
        if (!visNode[i]) {
            dfs(adjList, visNode, adjItemsList[i], result)
        }

    }

}
