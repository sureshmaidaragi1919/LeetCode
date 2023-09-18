package com.mobile.leetcode.easyproblems


private fun main() {

    val haystack = "mississippi"
    val needle = "a"
    println(strStr(haystack, needle))
}

private fun strStr(haystack: String, needle: String): Int {
    if (haystack == needle) return 0

    if (haystack.isEmpty() || needle.length >= haystack.length) return -1
    val hashmap = HashMap<String, Int>()

    var count = needle.length
    val haystackSize = haystack.length - count

    for (i in 0..haystackSize) {
        if (hashmap.containsKey(haystack.substring(i, count))) {

        } else {
            hashmap.put(haystack.substring(i, count), i)
        }
        count++

    }

    var result = if (hashmap.containsKey(needle)) {
        hashmap.getValue(needle)
    } else {
        -1
    }
    return result
}

private fun usingInbuilt(haystack: String, needle: String):Int {
    return haystack.indexOf(needle)

}


private  fun usingOptimisedWay(haystack: String, needle: String):Int {
    for ( i in 0..(haystack.length - needle.length) ) {
        if(haystack[i] == needle[0]) {
            if(haystack.substring(i, needle.length + i) == needle) {
                return i
            }
        }
    }

    return -1
}