package com.example.dichheadkotlin.repositories

import android.content.Context
import com.example.dichheadkotlin.enitites.CatFact
import com.example.dichheadkotlin.models.Hero
import com.example.dichheadkotlin.utils.RetrofitBuilder

class ProfileRepositoryImp(androidContext: Context) : ProfileRepository {
    override suspend fun fetchDotaHeroes(): List<Hero> {
     val heroes = arrayListOf<Hero>()
     with(heroes){
            add(Hero(1,"Pudge"))
            add(Hero(2,"Qop"))
      }
     return heroes
    }

}