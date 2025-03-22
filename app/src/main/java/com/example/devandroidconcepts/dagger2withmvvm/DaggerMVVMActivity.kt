package com.example.devandroidconcepts.dagger2withmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.devandroidconcepts.DaggerWithMVVMApplication
import com.example.devandroidconcepts.R
import com.example.devandroidconcepts.dagger2withmvvm.di.ApplicationComponent
import com.example.devandroidconcepts.dagger2withmvvm.repository.ApiUserRepositroy
import javax.inject.Inject

class DaggerMVVMActivity : AppCompatActivity() {

    lateinit var  daggerMVVMViewModel: DaggerMVVMViewModel
    @Inject
    lateinit var  daggerViewModelFactory: DaggerViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dagger_mvvm_activity)

        (application as DaggerWithMVVMApplication).applicationComponent.inject(this)
         daggerMVVMViewModel = ViewModelProvider(this,daggerViewModelFactory).get(DaggerMVVMViewModel::class.java)

       daggerMVVMViewModel.apiUserLiveData.observe(this, Observer {
           println("The our are : ${it.size}")
       })
    }
}