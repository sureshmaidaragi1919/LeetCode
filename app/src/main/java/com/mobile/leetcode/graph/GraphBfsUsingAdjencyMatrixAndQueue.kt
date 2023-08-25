package com.mobile.leetcode.graph

import java.util.LinkedList
import java.util.Queue


/*
* Time complexity o(v+e)(vertex+edge's)
*
*              B ------ C
*           /  |
*          A   |          F
*           \  |        /
*              D ------E
*
* */



private class GraphQ {
    var vertexCount = 0
    var MAX = 7
    var vertexList = Array<Vertex>(MAX, init = { Vertex('c') })
    var adjMat = Array(MAX, init = { Array(MAX, init = { 0 }) })
    var queue: Queue<Int> = LinkedList<Int>()

    fun addVertex(label: Char) {
        vertexList[vertexCount++] = Vertex(label)
    }

    fun addEdge(start: Int, end: Int) {
        adjMat[start][end] = 1
        adjMat[end][start] = 1
    }

    fun displayVertex(v: Int) {
        println("Vertex is ${vertexList[v].label} is visited ${vertexList[v].wasVisited}")
    }


    fun bfs() {

        queue.add(0)
        vertexList[0].wasVisited = true
        displayVertex(0)

        while (queue.isNotEmpty()) {

            var v = findAdjecentUnvisitedVertex(queue.peek())

            if (v == -1) {
                queue.poll()
            } else {
                vertexList[v].wasVisited = true
                displayVertex(v)
                queue.add(v)
            }
        }
    }


    fun findAdjecentUnvisitedVertex(v: Int): Int {

        for (i in 0..vertexCount) {

            if (adjMat[v][i] == 1 && !vertexList[i].wasVisited) {
                return i
            }
        }
        return -1
    }
}


fun main() {

    val graph = GraphQ()
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

    graph.bfs()


}