package com.example.dichheadkotlin.app

import android.app.Application
import com.example.dichheadkotlin.di.repositoryDIModule
import com.example.dichheadkotlin.viewmodels.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(repositoryDIModule, viewModelModule))
        }
    }
}