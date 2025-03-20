package com.example.devandroidconcepts.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelDemoFlowFactory (
    private val apiHelper: ApiHelper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelDemoFlow::class.java)) {
            return ViewModelDemoFlow(apiHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}