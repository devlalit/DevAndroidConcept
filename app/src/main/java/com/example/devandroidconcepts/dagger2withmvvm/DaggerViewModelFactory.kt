package com.example.devandroidconcepts.dagger2withmvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.devandroidconcepts.dagger2withmvvm.repository.ApiUserRepositroy
import javax.inject.Inject

class DaggerViewModelFactory @Inject constructor(private  val repositroy: ApiUserRepositroy):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DaggerMVVMViewModel(repositroy) as T
    }
}