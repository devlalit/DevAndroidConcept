package com.example.devandroidconcepts.junit.utils

class Helper {
    fun isPallindrome(input:String):Boolean{

        var  i  = 0
        var  j = input.length - 1
        var result = true

        while ( i <1){

            if(input[i] != input[j]){
                result = false
                break
            }
            i++
            j--
        }

        return result
    }
}