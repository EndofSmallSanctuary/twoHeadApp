package com.example.dichheadkotlin.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dichheadkotlin.coroutines.Coroutines
import com.example.dichheadkotlin.models.Hero
import com.example.dichheadkotlin.repositories.ProfileRepository
import kotlinx.coroutines.CoroutineScope

sealed class HeroesState {
    class successState(val heroes: List<Hero>) : HeroesState()
    object failedState : HeroesState()
}


class ProfileViewModel(private val repository: ProfileRepository) : ViewModel() {

    private val inmutedHeroStates = MutableLiveData<HeroesState>()
    val heroesStates: LiveData<HeroesState>
        get() {
           return inmutedHeroStates
        }

    fun prepareHeroesView(){
        Coroutines.runJobInIO{
            kotlin.runCatching {
               // inmutedHeroStates.postValue(HeroesState.failedState)
                 repository.fetchDotaHeroes()
            }.onSuccess { heroes ->
                inmutedHeroStates.postValue(HeroesState.successState(heroes = heroes))
            }
        }
    }
}