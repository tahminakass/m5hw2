package com.example.m5hw2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5hw2.databinding.FragmentLoveResultBinding

class LoveResultFragment : Fragment() {

    private val binding by lazy { FragmentLoveResultBinding.inflate(layoutInflater)}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val percentage = arguments?.getString("percentage") ?: "Нет данных"

        binding.tvScore.text = "Ваша совместимость: $percentage%"
    }
}