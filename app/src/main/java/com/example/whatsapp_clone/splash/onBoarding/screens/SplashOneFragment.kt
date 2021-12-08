package com.example.whatsapp_clone.splash.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentSplashOneBinding

//TODO this first splash screen NUMBER 1
class SplashOneFragment : Fragment() {
    private var _binding: FragmentSplashOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSplashOneBinding.inflate(inflater, container, false)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.myOnBoardingViewPager2)
        binding.apply {
            tvCallsNext.setOnClickListener {
                viewPager2?.currentItem = 1
            }

        }




        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}