package com.example.devandroidconcepts.flow

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class ViewModelDemoFlow(private  val  apiHelper: ApiHelper) : ViewModel() {
   val sharedFlow = MutableSharedFlow <Int>()
    init {
      //  fetchData()
        testSharedFlow()
    }
    fun testSharedFlow(){
       viewModelScope.launch {
           repeat(10){
               sharedFlow.emit(it)
           }
       }
    }
    fun fetchData(){

        viewModelScope.launch {
            apiHelper.getUsers()
                .flowOn(Dispatchers.IO)
                .catch {

                }
                .collect{
                    Log.d(TAG,it.toString())
                    println("Tesssssss"+it.toString())
                }
        }
    }
}