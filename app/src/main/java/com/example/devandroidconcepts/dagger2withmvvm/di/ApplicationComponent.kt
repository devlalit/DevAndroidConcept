package com.example.devandroidconcepts.dagger2withmvvm.di

import com.example.devandroidconcepts.dagger2withmvvm.DaggerMVVMActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(daggerMVVMActivity: DaggerMVVMActivity)
}