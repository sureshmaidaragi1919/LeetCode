package com.mobile.leetcode.graph

import java.util.Stack


/*
*
*              B ------ C
*           /  |
*          A   |          F
*           \  |        /
*              D ------E
*
* */
private class Graph {
    companion object {
        private const val MAX_VERTEX = 20

    }

    //Init graph metrics first
    private var nVertex = 0
    private var vertexList = Array(MAX_VERTEX, init = { Vertex('c') })
    private var adjMat = Array(MAX_VERTEX, init = { Array(MAX_VERTEX, init = { 0 }) })
    private var stack = Stack<Int>()


    fun addVertex(label: Char) {
        vertexList[nVertex++] = Vertex(label)
    }

    fun addEdge(start: Int, end: Int) {
        adjMat[start][end] = 1
        adjMat[end][start] = 1
    }

    fun dfs() {
        vertexList[0].wasVisited = true
        displayVertex(0)
        stack.push(0)

        while (stack.isNotEmpty()) {
            val vertex = getAdjUnVisitedVertex(stack.peek())

            if (vertex == -1) {
                stack.pop()
            } else {
                vertexList.get(vertex).wasVisited = true
                displayVertex(vertex)
                stack.push(vertex)
            }
        }
    }

    private fun getAdjUnVisitedVertex(v: Int): Int {

        for (j in 0..nVertex) {
            if (adjMat[v][j] == 1 && !vertexList[j].wasVisited) {
                return j
            }
        }

        return -1

    }

    private fun displayVertex(v: Int) {
        println("Visited ${vertexList[v].label}")
    }

}

class Vertex(var label: Char) {
    var wasVisited = false
}

fun main() {

    val graph = Graph()
    graph.addVertex('A')
    graph.addVertex('B')
    graph.addVertex('C')
    graph.addVertex('D')
    graph.addVertex('E')
    graph.addVertex('F')

    graph.addEdge(0, 1)
    graph.addEdge(1, 2)
    graph.addEdge(0, 3)
    graph.addEdge(3, 4)
    graph.addEdge(1, 3)
    graph.addEdge(4, 5)

    println("Visits : ")
    graph.dfs()
    println("........")

}




