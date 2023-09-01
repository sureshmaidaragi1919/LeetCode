package com.mobile.leetcode.string

import android.os.Build
import androidx.annotation.RequiresApi


/*
* A password is said to be strong if it satisfies the following criteria:

It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
Its length is at least 8.
It contains at least one digit.
Given a string, find its strength. Let a strong password is one that satisfies all above conditions. A moderate password is one that satisfies first three conditions and has length at least 6. Otherwise password is week.

Examples :

Input : “GeeksforGeeks!@12”
Output : Strong
* */


@RequiresApi(Build.VERSION_CODES.N)
private fun main() {

    //https://stackoverflow.com/a/21456918/4328589

    //Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    val passwordRegix = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8,}\$"
    var pattern_uppercase = ".*[A-Z].*"

    val specialString = "!@#\$%^&*()-+"

    var password = "@123Sur"

    isStrongUsingRegex(password)
}

private fun isStrongUsingRegex(input: String) {

    val passwordRegixWith8MinLength = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
    val passwordRegix6MinLength = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
    if (input.matches(Regex(passwordRegixWith8MinLength))) {
        println("Strong password")
    } else if (input.matches(Regex(passwordRegix6MinLength))){
        println("Moderate password")
    }else{
        println("Weak password")

    }

}

/*Without using any regex*/
private fun isStrong(input: String) {

    var isContainsNumber = false
    var isContainsLowerCase = false
    var isContainsUpperCase = false
    var isContainsSpecialCharacter = false
    var isValidLength = input.length

    input.contains("[a-zA-Z]")
    for (i in input.indices) {
        var tempChar = input[i]
        when {
            tempChar.isDigit() -> {
                isContainsNumber = true
            }

            tempChar.isLowerCase() -> {
                isContainsLowerCase = true
            }

            tempChar.isUpperCase() -> {
                isContainsUpperCase = true
            }

            else -> {
                isContainsSpecialCharacter = true
            }
        }
    }

    if (isValidLength >= 8 && isContainsNumber && isContainsLowerCase && isContainsUpperCase && isContainsSpecialCharacter) {
        println("Strong password")
    } else if (isValidLength <= 6 && isContainsNumber && isContainsLowerCase && isContainsUpperCase && isContainsSpecialCharacter) {
        println("Moderate password")
    } else {
        println("Weak password")
    }

}