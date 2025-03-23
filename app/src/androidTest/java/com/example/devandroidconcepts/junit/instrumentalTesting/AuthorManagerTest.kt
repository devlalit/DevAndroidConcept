package com.example.devandroidconcepts.junit.instrumentalTesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class AuthorManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test(expected =  FileNotFoundException::class)
    fun populateAuthorFromAssets() {
        val authorManager = AuthorManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        authorManager.populateAuthorFromAssets(context,"authoer.json")
        assertEquals(5,authorManager.emptyList.size)
    }

    @Test
    fun populateAuthorFromAssets_count() {
        val authorManager = AuthorManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        authorManager.populateAuthorFromAssets(context,"authoer.json")
        assertEquals(5,authorManager.emptyList.size)
    }

}