package com.example.dichheadkotlin.utils

import com.example.dichheadkotlin.api.RetrofitApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder{
    private const val BASE_URL = "https://catfact.ninja"

    private fun initRetrofit() : Retrofit {
        Retrofit.Builder().apply {
            baseUrl(BASE_URL)
            addConverterFactory(GsonConverterFactory.create())
            with(build()){
                return this
            }
        }
    }

    val retrofitApi: RetrofitApi = initRetrofit().create(RetrofitApi::class.java)
}