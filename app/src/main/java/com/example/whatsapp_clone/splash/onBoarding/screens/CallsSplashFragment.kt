package com.example.whatsapp_clone.splash.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp_clone.MainActivity
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.CallsFragmentBinding
import com.example.whatsapp_clone.databinding.FragmentCallsSplashBinding
import com.example.whatsapp_clone.databinding.FragmentLoginBinding
//TODO this first splash screen NUMBER 1
class CallsSplashFragment : Fragment() {
    private var _binding: FragmentCallsSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCallsSplashBinding.inflate(inflater, container, false)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.myViewPager2)
        binding.apply {
            tvCallsNext.setOnClickListener {
                Toast.makeText(context, "clicked next", Toast.LENGTH_SHORT).show()
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