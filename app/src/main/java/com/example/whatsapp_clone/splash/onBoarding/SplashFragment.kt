package com.example.whatsapp_clone.splash.onBoarding

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSplashBinding.inflate(inflater, container, false)

        Handler().postDelayed(
            {
                if (onBoardingFinished()){
                    findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
                }else{
                    findNavController().navigate(R.id.action_splashFragment_to_onBoardingViewPager2Fragment)
                }
            },2000
        )


        return binding.root
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
    private fun onBoardingFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)

    }

}