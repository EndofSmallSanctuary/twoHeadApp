package com.example.dichheadkotlin.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.dichheadkotlin.R
import com.example.dichheadkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setConfiguration()
    }

    private fun setConfiguration(){
        binding.imageMenu.setOnClickListener{
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        Navigation.findNavController(this, R.id.navHostFragment).apply {
            NavigationUI.setupWithNavController(binding.navigationView,this)
        }

        var liveArr = arrayListOf<Int>().apply {
            add(1)
            add(2)
            add(2)
            toSet().also {
                Log.d("TAG", "set configured: $it")

            }

        }

    }
}