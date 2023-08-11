package com.mobile.leetcode

import android.location.LocationRequest


class NodeV1(var data:Any){
    var left : NodeV1? = null
    var right : NodeV1? = null
}

fun main(){
    var tree = NodeV1(11)
    tree.left = NodeV1(12)
    tree.left!!.left = NodeV1(13)
    tree.left!!.right = NodeV1(14)
    tree.right = NodeV1(13)
}

suspend fun doSomething(requestLocationRequest: LocationRequest){

}