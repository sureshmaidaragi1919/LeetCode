package com.mobile.leetcode

class ProductOfArrayWithoutSelf {


    //Approach 1 using double for loop
    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            //input
            var arr = arrayOf(1, 2, 3, 4)

            //output
            // var output = arrayOf(24, 12, 8, 6)

            // var output = productOfArrayOnDivision(arr)

            //  printArray(output)
            productWithoutExtraSpace(arr)

        }


        //with O(n2)
        private fun productArrayUsingDoubleForLoop(arr: Array<Int>): Array<Int> {
            val output = emptyArray<Int>()

            for (i in arr.indices) {
                var product = 1
                for (j in arr.indices) {
                    if (i != j) {
                        product *= arr[j]
                    }
                }
                output[i] = product
            }

            return output
        }

        // with division O(n)+O(n) = O(n)
        private fun productOfArrayOnDivision(array: Array<Int>): Array<Int> {

            var product = 1

            for (element in array) {
                product *= element
            }

            for (i in array.indices) {
                if (array[i] == 0) {
                    array[i] = 0
                } else {
                    array[i] = product / array[i]
                }

            }

            return array

        }

        //time = O(n) space = O(n)
        private fun productUsingExtraSpace(arr: Array<Int>) {
            var leftSum = arrayOfNulls<Int>(arr.size)
            var rightSum = arrayOfNulls<Int>(arr.size)
            var outPut = arrayOfNulls<Int>(arr.size)


            //leftSum

            for (i in arr.indices) {
                if (i == 0) {
                    leftSum[i] = arr[i]
                } else {
                    leftSum[i] = arr[i] * leftSum[i - 1]!!
                }

            }


            for (i in arr.size - 1 downTo 0) {
                if (i == arr.size - 1) {
                    rightSum[i] = arr[i]
                } else {
                    rightSum[i] = arr[i] * rightSum[i + 1]!!
                }

            }


            // left sum  -> 1 2 3 24
            // right sum  -> 24 24 12 4

            for (i in arr.indices) {

                when (i) {
                    0 -> { //boundary case
                        outPut[i] = rightSum[i + 1]
                    }
                    arr.size - 1 -> { //boundary case
                        outPut[i] = leftSum[arr.size - 2]
                    }
                    else -> {

                        outPut[i] = leftSum[i - 1]!! * rightSum[i + 1]!!
                    }
                }
            }
            printArray(outPut)

        }
/*        private fun productWithoutExtraSpace(arr: Array<Int>) {

            var leftProduct = arrayOfNulls<Int>(arr.size)
            var output = arrayOfNulls<Int>(arr.size)

            for (i in arr.indices) {

                if (i == 0) {
                    leftProduct[i] = arr[i]
                } else {
                    leftProduct[i] = arr[i] * leftProduct[i - 1]!!
                }

            }

            for (i in arr.size - 1 downTo 0) {

                var product = 1
                if (i == 0) {
                    output[i] = product * leftProduct[i + 1]!!
                } else if (i == arr.size - 1) {
                    output[i] = leftProduct[i - 2]
                    product = leftProduct[i - 1]!!
                } else {
                    product *= product * arr[i]
                    output[i] = product * leftProduct[i - 1]!!
                }

            }

            printArray(output)
        }*/

        private fun printArray(arr: Array<Int?>) {
            for (element in arr) {
                print("$element ")
            }
        }
    }
}