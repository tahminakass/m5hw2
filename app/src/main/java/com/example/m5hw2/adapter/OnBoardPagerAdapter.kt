package com.example.m5hw2.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.m5hw2.R
import com.example.m5hw2.onboard.OnBoardingActivity
import com.example.m5hw2.onboard.OnBoardingFragment

class OnBoardPagerAdapter(fragment: OnBoardingActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OnBoardingFragment.newInstance(R.layout.fragment_on_boarding1)
            1 -> OnBoardingFragment.newInstance(R.layout.fragment_on_boarding2)
            2 -> OnBoardingFragment.newInstance(R.layout.fragment_on_boarding3)
            else -> throw IllegalStateException("Invalid position")
        }
    }
}