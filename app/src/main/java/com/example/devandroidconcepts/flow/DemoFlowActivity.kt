package com.example.devandroidconcepts.flow

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.devandroidconcepts.R
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class DemoFlowActivity : AppCompatActivity1() {
    lateinit var viewModelDemoFlow: ViewModelDemoFlow
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiHelper = ApiHelperImplemention(RetrfitBuilder.apiService)
        val factory = ViewModelDemoFlowFactory(apiHelper)
        viewModelDemoFlow = ViewModelProvider(this,factory)[ViewModelDemoFlow::class.java]
    }
}