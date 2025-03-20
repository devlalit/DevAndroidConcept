package com.example.devandroidconcepts.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ApiHelperImplemention(val apiService: ApiService):ApiHelper {
    override fun getUsers() = flow {
         emit(apiService.getUser())
    }
}