package com.example.whatsapp_clone.homeMenuFragments.messageAnAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentMessageAnAccountBinding

class MessageAnAccountFragment : Fragment() {

    private var _binding: FragmentMessageAnAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMessageAnAccountBinding.inflate(inflater, container ,false)






        return binding.root
    }





    //last code
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}