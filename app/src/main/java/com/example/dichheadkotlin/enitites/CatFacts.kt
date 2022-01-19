package com.example.dichheadkotlin.enitites
import com.google.gson.annotations.SerializedName

data class CatFact(
    @SerializedName("fact")
    val fact: String?,
    @SerializedName("length")
    val length: Int?

)