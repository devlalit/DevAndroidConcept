package com.example.devandroidconcepts.flow

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.devandroidconcepts.R
import com.example.devandroidconcepts.flow.utils.checkConnection
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class DemoFlowActivity : AppCompatActivity1() {
    val sharedFlow = MutableSharedFlow<Int>()
    val satedFlow = MutableStateFlow(0)
    lateinit var viewModelDemoFlow: ViewModelDemoFlow
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiHelper = ApiHelperImplemention(RetrfitBuilder.apiService)
        val factory = ViewModelDemoFlowFactory(apiHelper)
        viewModelDemoFlow = ViewModelProvider(this, factory)[ViewModelDemoFlow::class.java]


        lifecycleScope.launch {
            checkConnection().collect{
              val result =   when(it) {
                    true -> "It connected"
                    false -> "Not connected"
                }

            }
        }
        //shared flow

      /*  lifecycleScope.launch {
            satedFlow.collect {
                println("The value1 : $it")
            }
        }*/

           /* lifecycleScope.launch {

                satedFlow.collect {
                    println("The value2 : $it")
                }
                delay(1000)

            }*/
      /*  lifecycleScope.launch {
          *//*  sharedFlow.emit(1)
            sharedFlow.emit(2)
            sharedFlow.emit(3)*//*
            satedFlow.value = 2
            satedFlow.value =3
        }*/

           /* fun coldFlow(): Flow<Int> = flow {
                for (i in 1..3) {
                    emit(i)
                }
            }*/

         lifecycleScope.launch {
             fetchDataFlow().collect{data ->
                 println("the  getting data $data")
             }
         }

        }
    fun fetchDataFlow() : Flow<Int> = channelFlow {
        val data1 = launch {
            send(1)
        }

        val data2 = launch {
            send(2)
        }
    }
    }