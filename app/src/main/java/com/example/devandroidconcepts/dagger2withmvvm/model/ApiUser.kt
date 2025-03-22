package com.example.devandroidconcepts.dagger2withmvvm.model

import com.google.gson.annotations.SerializedName

data class ApiUser(
    @SerializedName("id")
    val id : Int = 0,
    @SerializedName("name")
    val name : String =""

)
