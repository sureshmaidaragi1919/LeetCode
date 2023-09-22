package com.mobile.leetcode.thirtdaysplan


private fun main() {

    var arr = intArrayOf(3, 1, -2, -5, 2, -4)
    rearrange(arr)
    usingPointers(arr)
}


/*
* Brute force approach
* TC : o(n) +o(n)
* SC : o(n)
* */
private fun rearrange(array: IntArray) {

    var posArr = IntArray(array.size / 2)
    var negArr = IntArray(array.size / 2)
    var posIndex = 0
    var negIndex = 0

    for (i in 0 until array.size) {
        if (array[i] < 0)
            negArr[negIndex++] = array[i]
        else
            posArr[posIndex++] = array[i]
    }

    var outputArray = IntArray(array.size)
    for (i in 0 until (array.size / 2)) {

        outputArray[2 * i] = posArr[i]
        outputArray[2 * i + 1] = negArr[i]
    }

    println(outputArray.toList())

}

/*
* TC : o(n)
* SC: o(n) for output
* */
private fun usingPointers(array: IntArray) {
    var posPointer = 0
    var negPointer = 1
    var output = IntArray(array.size)


    for (i in 0 until array.size) {

        if (array[i] < 0) {
            output[negPointer] = array[i]
            negPointer += 2
        } else {
            output[posPointer] = array[i]
            posPointer += 2
        }
    }

    println(output.toList())

}