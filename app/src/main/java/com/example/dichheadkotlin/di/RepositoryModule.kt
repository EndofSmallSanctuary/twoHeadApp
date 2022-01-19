package com.example.dichheadkotlin.di

import com.example.dichheadkotlin.repositories.ProfileRepository
import com.example.dichheadkotlin.repositories.ProfileRepositoryImp
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryDIModule = module {
    factory<ProfileRepository> {ProfileRepositoryImp(androidContext())}
}