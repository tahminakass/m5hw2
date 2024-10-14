package com.example.m5hw2

import retrofit2.Retrofit
import retrofit2.create

object RetrofitService {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://love-calculator.p.rapidapi.com").build()

    val service = retrofit.create<ApiService>()
}