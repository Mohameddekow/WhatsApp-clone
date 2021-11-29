package com.example.whatsapp_clone.tabs.status


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.CallsFragmentBinding
import com.example.whatsapp_clone.databinding.StatusFragmentBinding

class StatusFragment : Fragment() {
    private var _binding: StatusFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = StatusFragmentBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}