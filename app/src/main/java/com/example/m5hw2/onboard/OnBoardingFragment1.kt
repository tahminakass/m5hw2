package com.example.m5hw2.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5hw2.R
import com.example.m5hw2.databinding.FragmentFirstBinding
import com.example.m5hw2.databinding.FragmentOnBoarding1Binding

class OnBoardingFragment1 : Fragment() {

    private val binding by lazy { FragmentOnBoarding1Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}