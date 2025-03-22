package com.example.devandroidconcepts.dagger2withmvvm

import com.example.devandroidconcepts.dagger2withmvvm.model.ApiUser
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
  suspend  fun getUser(): Response<List<ApiUser>>
}