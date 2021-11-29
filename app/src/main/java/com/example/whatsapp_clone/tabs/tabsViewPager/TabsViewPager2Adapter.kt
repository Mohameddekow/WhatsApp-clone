package com.example.whatsapp_clone.tabs.tabsViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsapp_clone.tabs.calls.CallsFragment
import com.example.whatsapp_clone.tabs.chats.ChatsFragment
import com.example.whatsapp_clone.tabs.status.StatusFragment

class TabsViewPager2Adapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter (fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
       return when(position){
            0 -> ChatsFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else ->  ChatsFragment()
        }
    }

}