package com.example.sfera_ed.people.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.sfera_ed.people.tabs.MutualsFragment
import com.example.sfera_ed.people.tabs.SubscribersFragment
import com.example.sfera_ed.people.tabs.SubscriptionsFragment
import java.security.AccessControlContext

class PeoplePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> SubscribersFragment()
            1 -> SubscriptionsFragment()
            else -> {MutualsFragment()}
        }
    }
}