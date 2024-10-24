package com.example.m5hw2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class OnBoardingFragment : Fragment() {

companion object {
    private const val ARG_LAYOUT_RES_ID = "layoutResId"

    fun newInstance(layoutResId: Int) : OnBoardingFragment {
        val fragment = OnBoardingFragment()
        val args = Bundle()
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId)
        fragment.arguments = args
        return fragment
    }
}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutResId = arguments?.getInt(ARG_LAYOUT_RES_ID)
        return inflater.inflate(layoutResId!!, container, false)
    }
}