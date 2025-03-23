package com.example.devandroidconcepts.junit.instrumentalTesting

import android.content.Context
import com.google.gson.Gson
import java.nio.Buffer

class AuthorManager {
    var emptyList = emptyArray<Author>()
    fun populateAuthorFromAssets(context: Context,filename:String){
        val inputStream = context.assets.open(filename)
        val size :Int = inputStream.available()
        val  buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer,Charsets.UTF_8)
        val gson = Gson()
        emptyList = gson.fromJson(json,Array<Author>::class.java)
    }
}