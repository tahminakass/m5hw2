package com.example.m5hw2

import com.example.m5hw2.model.PercentageModel

interface RegistrationView {

    fun showLoading()
    fun hideLoading()
    fun showSuccessResult(result: PercentageModel)
    fun showError(errorMessage: String)

}