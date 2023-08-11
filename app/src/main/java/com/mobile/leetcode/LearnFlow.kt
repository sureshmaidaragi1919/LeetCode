package com.mobile.leetcode

import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch


fun main(){


     GlobalScope.launch {
         added()
     }

}

suspend fun  added(){
    flow {
        (0..10).forEach {
            emit(it)
        }
    }.map {
        it * it
    }.collect {
        Log.d("SURESH", it.toString())
    }
}