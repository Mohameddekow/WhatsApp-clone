package com.example.whatsapp_clone.homeMenuFragments.starredMessages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentStarredMessagesBinding

class StarredMessagesFragment : Fragment() {

    private var _binding:FragmentStarredMessagesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStarredMessagesBinding.inflate(inflater, container, false)




        return binding.root
    }



    //last code
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}