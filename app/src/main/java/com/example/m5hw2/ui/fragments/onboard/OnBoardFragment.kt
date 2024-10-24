package com.example.m5hw2.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5hw2.R
import com.example.m5hw2.adapter.OnBoardPagerAdapter
import com.example.m5hw2.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {

    private val binding by lazy {
        FragmentOnBoardBinding.inflate(layoutInflater)
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

    private fun initialize() {
        binding.viewPager2.adapter = OnBoardPagerAdapter(this)
    }
}