package com.example.whatsapp_clone.splash.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp_clone.databinding.FragmentViewPager2Binding
import com.example.whatsapp_clone.splash.onBoarding.screens.SplashOneFragment
import com.example.whatsapp_clone.splash.onBoarding.screens.SplashTwoFragment
import com.example.whatsapp_clone.splash.onBoarding.screens.SplashThreeFragment

class OnBoardingViewPager2Fragment : Fragment() {

    private var _binding: FragmentViewPager2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPager2Binding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            SplashOneFragment(),
            SplashTwoFragment(),
            SplashThreeFragment()
        )

        val adapter = OnBoardingViewPager2Adapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.myOnBoardingViewPager2.adapter = adapter



        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}