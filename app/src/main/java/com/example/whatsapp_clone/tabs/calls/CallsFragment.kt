package com.example.whatsapp_clone.tabs.calls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp_clone.databinding.CallsFragmentBinding
import androidx.appcompat.app.AppCompatActivity


class CallsFragment: Fragment() {

    private var _binding: CallsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CallsFragmentBinding.inflate(inflater, container, false)

        //set up the toolbar
        //val toolBar = binding.myTabToolbar
       // (activity as AppCompatActivity?)!!.setSupportActionBar(toolBar)


        return binding.root
    }


    //all codes must go above this
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}