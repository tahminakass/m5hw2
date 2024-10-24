package com.example.m5hw2.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5hw2.R
import com.example.m5hw2.databinding.FragmentOnBoardBinding
import com.example.m5hw2.databinding.FragmentOnBoardPagingBinding


class OnBoardPagingFragment : Fragment() {

    private val binding by lazy {
        FragmentOnBoardPagingBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when (requireArguments().getInt(ARG_ONBOARD_POSITION)) {
            0 -> {

            }

            1 -> {
                binding.ivOnboard.setImageResource(R.drawable.onboarding_2)
                tvOnboard.text = "Cherishing love \n It is now no longer possible for you to cherish love"
            }

            2 -> {
                binding.ivOnboard.setImageResource(R.drawable.onboarding_3)
                tvOnboard.text = "Have a breakup? \n We have made the orrection for you \n don't worry \n Maybe someone is waiting for you"
            }
        }
    }
    companion object {
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}