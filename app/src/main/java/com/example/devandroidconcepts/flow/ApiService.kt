package com.example.devandroidconcepts.flow

import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUser() : List<ApiUser>
}