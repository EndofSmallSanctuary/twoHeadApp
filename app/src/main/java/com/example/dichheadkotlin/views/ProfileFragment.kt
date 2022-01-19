package com.example.dichheadkotlin.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.dichheadkotlin.databinding.FragmentProfileBinding
import com.example.dichheadkotlin.viewmodels.HeroesState
import com.example.dichheadkotlin.viewmodels.ProfileViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val viewModel: ProfileViewModel by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)
        onInitialMethodsBecome()
        onObservation()
        return binding.root
    }

    fun onInitialMethodsBecome(){
        viewModel.prepareHeroesView()
    }

    fun onObservation(){
        viewModel.heroesStates.observe(this,{
            val heroesState = it ?: return@observe
            when(heroesState){
               is HeroesState.successState ->
                    Log.d("TAG",heroesState.heroes.toString())
                is HeroesState.failedState ->
                    Log.d("TAG","state failed")
            }
        })
    }

}