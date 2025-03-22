package com.example.devandroidconcepts

import android.app.Application
import com.example.devandroidconcepts.dagger2withmvvm.di.ApplicationComponent
import com.example.devandroidconcepts.dagger2withmvvm.di.DaggerApplicationComponent
import dagger.Component

class DaggerWithMVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}