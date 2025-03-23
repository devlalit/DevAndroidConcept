package com.example.devandroidconcepts.junit.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    @Before
    fun beforeTest(){
        println("Before text case")
    }
    @After
    fun afterTestCase(){
        println("After test case")
    }
    @Test
    fun isPallindrome() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(true,result)
    }
}