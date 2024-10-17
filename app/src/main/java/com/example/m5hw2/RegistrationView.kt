package com.example.m5hw2

interface RegistrationView {

    fun showLoading()
    fun hideLoading()
    fun showSuccessResult(result: PercentageModel)
    fun showError(errorMessage: String)

}