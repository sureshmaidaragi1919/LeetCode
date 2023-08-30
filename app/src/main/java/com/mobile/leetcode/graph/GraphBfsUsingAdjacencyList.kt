package com.mobile.leetcode.graph

import java.util.LinkedList


/*
*                       1
*                   /     \
*                2           6
*              /     \            /   \
*           3           4       7     9
*                        \        /
*                          5 ---- 8
*
*
* BFS = 1,2,6,3,4,7,9,5,8
* result
* */

class GraphV(v: Int) {

    //No of vertices
    private var v: Int = v

    // Adjacency Lists
    private var adj: Array<LinkedList<Int>> = Array(v, init = { LinkedList<Int>() })

    init {
        for (i in 0 until v) adj[i] = LinkedList<Int>()
    }

    // Function to add an edge into the graph
    fun addEdge(v: Int, w: Int) {
        adj[v].add(w)
    }


    //Prints BFs traversal from given source s
    fun BFS(s: Int) {

        var s = s
        //Mark all the vertices as not visited by default false
        var visitedList = Array<Boolean>(v, init = { false })


        //Create a queue for BFS
        var queue = LinkedList<Int>()

        //Mark current node as visited

        visitedList[s] = true
        queue.add(s)

        while (queue.size != 0) {

            //Deque vertex from queue and print it
            s = queue.poll()
            println(s)

            var adjList = adj.get(s).listIterator()
            while (adjList.hasNext()) {

                var n = adjList.next()
                if (!visitedList[n]) {
                    visitedList[n] = true
                    queue.add(n)
                }
            }
        }

    }
}


private fun main() {
    val g = GraphV(4)
    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    println(
        "Following is Breadth First Traversal " + "(starting from vertex 2)"
    )

    g.BFS(2)

}