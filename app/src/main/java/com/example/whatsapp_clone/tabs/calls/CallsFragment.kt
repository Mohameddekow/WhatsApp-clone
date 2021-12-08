package com.example.whatsapp_clone.tabs.calls

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.whatsapp_clone.R
import com.example.whatsapp_clone.databinding.FragmentCallsBinding


class CallsFragment: Fragment() {

    private var _binding: FragmentCallsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCallsBinding.inflate(inflater, container, false)

        //set up the toolbar
//        val toolBar = binding.callsFragmentToolbar
//        (activity as AppCompatActivity?)!!.setSupportActionBar(toolBar)
//
//        setHasOptionsMenu(true)

        return binding.root
    }

//    //create home menu
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.home_menu, menu)
//
////        val search = menu.findItem(R.id.searchMenu)
////        val searchView =  search?.actionView as SearchView
////        searchView.isSubmitButtonEnabled = true
////        searchView.setOnQueryTextListener(this)
//    }
//
//    //set item click listener to my home menu items
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.profileFragment -> {
//                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
//            }
//            R.id.messageAnAccountFragment -> {
//                findNavController().navigate(R.id.action_homeFragment_to_messageAnAccountFragment)
//            }
//            R.id.starredMessagesFragment -> {
//                findNavController().navigate(R.id.action_homeFragment_to_starredMessagesFragment)
//            }
//            R.id.settingsFragment -> {
//                findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
//            }
//            else -> {
//            }
//        }
//        return true
//    }


    //all codes must go above this
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}