package com.example.dichheadkotlin.viewmodels

import com.example.dichheadkotlin.repositories.ProfileRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ProfileViewModel(repository = get()) }
}