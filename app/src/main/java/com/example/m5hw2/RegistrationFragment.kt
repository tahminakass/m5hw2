package com.example.m5hw2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.R
import androidx.navigation.fragment.findNavController
import com.example.m5hw2.databinding.FragmentRegistrationBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegistrationFragment : Fragment(), RegistrationView {

    private val binding by lazy { FragmentRegistrationBinding.inflate(layoutInflater) }
    private lateinit var presenter: RegistrationPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = RegistrationPresenter(this)

        binding.btnCalculate.setOnClickListener {
            val firstName = binding.etName.text.toString()
            val secondName = binding.etSecondName.text.toString()

            presenter.calculatePercentage(firstName, secondName)
        }
    }

    override fun showLoading() {
        binding.btnCalculate.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        binding.btnCalculate.visibility = View.GONE
    }

    override fun showSuccessResult(result: PercentageModel) {
        val action =  RegistrationFragmentDirections.actionRegistrationFragmentToLoveResultFragment(
            result.percentage.toString())
        findNavController().navigate(action)
    }

    override fun showError(errorMessage: String) {
        Toast.makeText(requireContext(), errorMessage, Toast.LENGTH_LONG).show()
    }
}


