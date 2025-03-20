package com.example.devandroidconcepts.flow

import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    fun getUsers(): Flow<List<ApiUser>>
}