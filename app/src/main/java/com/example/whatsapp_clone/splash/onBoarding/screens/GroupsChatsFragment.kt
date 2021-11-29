package com.example.whatsapp_clone.splash.onBoarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.CallsFragmentBinding
import com.example.whatsapp_clone.databinding.FragmentGroupsChatsBinding

class GroupsChatsFragment : Fragment() {

    private var _binding: FragmentGroupsChatsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGroupsChatsBinding.inflate(inflater, container, false)

        binding.apply {
            tvGroupFinish.setOnClickListener {
                findNavController().navigate(R.id.action_viewPager2Fragment_to_loginFragment)
                onBoardingFinished()
            }

        }

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}