package com.example.devandroidconcepts.dagger2withmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.devandroidconcepts.dagger2withmvvm.ApiService
import com.example.devandroidconcepts.dagger2withmvvm.model.ApiUser
import javax.inject.Inject

class ApiUserRepositroy @Inject constructor(private  val apiService: ApiService) {

    val apiUser = MutableLiveData<List<ApiUser>>()
    val liveApiUer : LiveData<List<ApiUser>>
        get() =  apiUser
    suspend fun getUser(){
         val result = apiService.getUser()
         if(result.isSuccessful && result != null){
              apiUser.postValue(result.body())
         }
     }
}