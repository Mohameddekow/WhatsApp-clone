package com.example.whatsapp_clone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.whatsapp_clone.databinding.FragmentHomeBinding
import com.example.whatsapp_clone.tabs.tabsViewPager.TabsViewPager2Adapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(), SearchView.OnQueryTextListener {
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

        //setting up the menu
        setHasOptionsMenu(true)

        //set up the toolbar
        val toolBar = binding.homeToolbar
         (activity as AppCompatActivity?)!!.setSupportActionBar(toolBar)

        val navController = findNavController()
        val appConfiguration = AppBarConfiguration(navController.graph, null)
        toolBar.setupWithNavController(navController, appConfiguration)

        return binding.root
    }

    //tab fun
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

    //create home menu
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_menu, menu)

        val search = menu.findItem(R.id.searchMenu)
        val searchView =  search?.actionView as SearchView
        searchView.isSubmitButtonEnabled = true
        searchView.setOnQueryTextListener(this)
    }

    //set item click listener to my home menu items
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profileFragment -> {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
            }
            R.id.messageAnAccountFragment -> {
                findNavController().navigate(R.id.action_homeFragment_to_messageAnAccountFragment)
            }
            R.id.starredMessagesFragment -> {
                findNavController().navigate(R.id.action_homeFragment_to_starredMessagesFragment)
            }
            R.id.settingsFragment -> {
                findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
            }
            else -> {
            }
        }
        return true
    }


    //search on text typed
    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            searchDatabase(query)
        }
        return true
    }

   // search on character typed
    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText != null) {
            searchDatabase(newText)
        }
        return true
    }

    //search from database
    private fun searchDatabase(query: String){

    }

    //all codes must go above this fun
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }


}