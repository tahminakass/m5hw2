package com.example.m5hw2

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegistrationPresenter(private val view: RegistrationView) {

    fun calculatePercentage(firstName: String, secondName: String) {
        view.showLoading()

        RetrofitService.api.fetchPercentage(
            firstName = firstName,
            host = "love-calculator.p.rapidapi.com",
            key = "13db8c0c9fmsh0e8b65404615b3ap1035a5jsn85bfe5faab5c",
            secondName = secondName
        ).enqueue(object : Callback<PercentageModel> {
            override fun onResponse(
                call: Call<PercentageModel>,
                response: Response<PercentageModel>
            ) {
                view.hideLoading()
                if (response.isSuccessful && response.body() != null) {
                    view.showSuccessResult(response.body()!!)
                } else {
                    view.showError("Ошибка: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<PercentageModel>, t: Throwable) {
                view.hideLoading()
                view.showError("Ошибка сети: ${t.localizedMessage}")
            }
        })
    }
}