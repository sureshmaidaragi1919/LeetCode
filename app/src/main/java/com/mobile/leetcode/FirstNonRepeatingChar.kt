package com.mobile.leetcode


/*
*  input  = "aaabcccdeeef"
*   output  = 'b'
*
* */


fun main() {

    val input = "aaabcccdeeef"
    val output = 'b'
    println(standardAlphabetCount(input))
}

//approach 1 double for loop
fun nSquareTime(input: String): Char {

    for (i in 0 until input.length - 1) {

        var seenDuplicate = false

        for (j in 0 until input.length - 1) {

            if (input[i] == input[j] && i != j) {
                seenDuplicate = true
                break
            }
        }

        if (!seenDuplicate) return input[i]

    }
    return '-'
}

//approach 2 using hashmap
fun usingHashMap(input: String): Char {

    val map = hashMapOf<Char, Int>()

    for (i in 0 until input.length - 1) {

        if (map.containsKey(input[i])) {
            map[input[i]] = map[input[i]]!! + 1
        } else {
            map[input[i]] = 1
        }

    }

    //order of hashmap is not maintained so we iterate throw list again to find which key has 1

    for (i in 0 until input.length - 1) {

        if (map[input[i]] == 1) {
            return input[i]
        }
    }

    return '-'
}

//approach 3 standardAlphabetCount
fun standardAlphabetCount(input: String): Char {

    val charCount = IntArray(26)

    for (character in input) {
        charCount[character - 'a']++
    }

    for (character in input) {
        if (charCount[character - 'a'] == 1) return character
    }

    return '-'
}