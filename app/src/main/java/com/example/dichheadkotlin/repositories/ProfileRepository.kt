package com.example.dichheadkotlin.repositories

import com.example.dichheadkotlin.enitites.CatFact
import com.example.dichheadkotlin.models.Hero

interface ProfileRepository {
    suspend fun fetchDotaHeroes() : List<Hero>
    suspend fun fetchSomeFacts() : CatFact
}