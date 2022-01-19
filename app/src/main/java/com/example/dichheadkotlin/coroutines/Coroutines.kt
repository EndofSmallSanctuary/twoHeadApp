package com.example.dichheadkotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object Coroutines {

    fun runJobInIO(job:suspend (()->Unit)){
        CoroutineScope(Dispatchers.IO).launch {
            delay(3000L)
            job()
        }
    }
}