package com.example.m5hw2


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//CRUD
//C-create - post
//R-read - get
//U-update - put, post
//D-delete - delete
// https://online.geeks.kg/ - base url
// https://online.geeks.kg/lesson - endpoint / method
// https://love-calculator.p.rapidapi.com/getPercentage?sname=Alice&fname=John
//https://love-calculator.p.rapidapi.com/ - base url
// https://love-calculator.p.rapidapi.com/getPercentage - endpoint
// ?sname=Alice&fname=John - Query params
// Header - x-rapidapi-key - 13db8c0c9fmsh0e8b65404615b3ap1035a5jsn85bfe5faab5c
// Header -x-rapidapi-host - ove-calculator.p.rapidapi.com


interface ApiService {

    @GET("getPercentage")
    fun fetchPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("x-rapidapi-key") key: String,
        @Header("x-rapidapi-host") host: String
    ): Call<PercentageModel>
}