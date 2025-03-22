package com.example.devandroidconcepts.dagger2withmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.devandroidconcepts.dagger2withmvvm.model.ApiUser
import com.example.devandroidconcepts.dagger2withmvvm.repository.ApiUserRepositroy
import kotlinx.coroutines.launch

class DaggerMVVMViewModel(private  val repositroy: ApiUserRepositroy) : ViewModel() {
    val apiUserLiveData : LiveData<List<ApiUser>>
        get() = repositroy.liveApiUer

    init {
        fetchUser()
    }
    fun fetchUser(){
        viewModelScope.launch {
            repositroy.getUser()
        }
    }

}