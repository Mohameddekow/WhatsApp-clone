package com.example.whatsapp_clone.splash.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.CallsFragmentBinding
import com.example.whatsapp_clone.databinding.ChatsFragmentBinding
import com.example.whatsapp_clone.databinding.FragmentChatsSplashBinding
//TODO this second splash screen NUMBER 2

class ChatsSplashFragment : Fragment() {

    private var _binding: FragmentChatsSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChatsSplashBinding.inflate(inflater, container, false)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.myViewPager2)
        binding.tvChatsNext.setOnClickListener {
            viewPager2?.currentItem = 2
        }


        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}