package com.example.dichheadkotlin.api

import com.example.dichheadkotlin.enitites.CatFact
import retrofit2.http.GET


interface RetrofitApi {

    @GET("/fact")
    suspend fun getFacts() : CatFact


}