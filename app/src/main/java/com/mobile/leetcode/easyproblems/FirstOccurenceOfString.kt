package com.mobile.leetcode.easyproblems


private fun main() {

    val haystack = "mississippi"
    val needle = "issip"
    // println(strStr(haystack, needle))
    println(usingPointer(haystack, needle))
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


private fun usingOptimisedWay(haystack: String, needle: String): Int {
    for (i in 0..(haystack.length - needle.length)) {
        if (haystack[i] == needle[0]) {
            if (haystack.substring(i, needle.length + i) == needle) {
                return i
            }
        }
    }

    return -1
}

private fun usingPointer(haystack: String, needle: String): Int {

    if(haystack.equals(needle)) return 0
    if(haystack.length<needle.length) return -1
    var size = haystack.length - needle.length+1
    if(needle.length==1) size=haystack.length

    for(i in 0 until size){
        if(haystack[i]==needle[0]&&haystack.substring(i,i+needle.length)==needle){
            return i
        }
    }
    return -1
}