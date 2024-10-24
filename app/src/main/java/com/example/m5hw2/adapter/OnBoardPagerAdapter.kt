package com.example.m5hw2.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.m5hw2.R
import com.example.m5hw2.ui.fragments.OnBoardingFragment
import com.example.m5hw2.ui.fragments.onboard.OnBoardFragment
import com.example.m5hw2.ui.fragments.onboard.OnBoardPagingFragment

class OnBoardPagerAdapter(fragment: OnBoardFragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) = OnBoardPagingFragment().apply {
        arguments = Bundle().apply {
            putInt(ARG_ONBOARD_POSITION, position)
        }
    }
}