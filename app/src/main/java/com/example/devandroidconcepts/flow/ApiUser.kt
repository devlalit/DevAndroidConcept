package com.example.devandroidconcepts.flow

import com.google.gson.annotations.SerializedName

data class ApiUser(
    @SerializedName("id")
    val id : Int = 0,
    @SerializedName("name")
    val name : String =""
)
