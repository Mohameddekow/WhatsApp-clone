package com.example.whatsapp_clone

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.whatsapp_clone.databinding.FragmentHomeBinding
import com.example.whatsapp_clone.databinding.FragmentLoginBinding
import com.example.whatsapp_clone.splash.onBoarding.ViewPager2Adapter
import com.example.whatsapp_clone.tabs.calls.CallsFragment
import com.example.whatsapp_clone.tabs.chats.ChatsFragment
import com.example.whatsapp_clone.tabs.status.StatusFragment
import com.example.whatsapp_clone.tabs.tabsViewPager.TabsViewPager2Adapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        //setUpTabs //chats , groups, calls tabs
        setUpTabLayout()

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_callsFragment)
        }



        return binding.root
    }
    private fun setUpTabLayout(){
        val tabsTitles = arrayListOf<String>("CHATS", "STATUS", "CALLS")
        val viewPager2 = binding.tabsViewPager2
        val tabLayout = binding.myTabLayout
        val adapter = TabsViewPager2Adapter(requireActivity().supportFragmentManager, requireActivity().lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){
                tab, position -> tab.text = tabsTitles[position]

        }.attach()
    }


    //all codes must go above this fun
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}