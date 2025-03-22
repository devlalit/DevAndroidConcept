package com.example.devandroidconcepts.dagger2withmvvm.di

import com.example.devandroidconcepts.dagger2withmvvm.ApiService
import com.example.devandroidconcepts.dagger2withmvvm.Constance

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun providerRetrofit(): Retrofit {
        return  Retrofit.Builder()
            .baseUrl(Constance.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}