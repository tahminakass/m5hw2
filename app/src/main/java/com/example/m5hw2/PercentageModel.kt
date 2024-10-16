package com.example.m5hw2

import com.google.gson.annotations.SerializedName

data class PercentageModel (
     @SerializedName("fname")
    val firstName: String,
     @SerializedName("sname")
    val secondName: String,
     @SerializedName("percentage")
    val percentage: Int,
     @SerializedName("result")
    val result: String

)
