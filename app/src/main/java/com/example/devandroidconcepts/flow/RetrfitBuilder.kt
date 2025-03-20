package com.example.devandroidconcepts.flow

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrfitBuilder {
    private const  val BASE_URR = "https://5e510330f2c0d300147c034c.mockapi.io/"

    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URR)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService : ApiService = getInstance().create(ApiService::class.java)
}