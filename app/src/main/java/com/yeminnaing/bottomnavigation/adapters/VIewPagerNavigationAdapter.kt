package com.yeminnaing.bottomnavigation.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yeminnaing.bottomnavigation.activities.ViewPagerWithBottomNavigationBar
import com.yeminnaing.bottomnavigation.fragments.HomeFragment
import com.yeminnaing.bottomnavigation.fragments.NotificationFragment
import com.yeminnaing.bottomnavigation.fragments.ProfileFragment

class VIewPagerNavigationAdapter(fragment: ViewPagerWithBottomNavigationBar) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                NotificationFragment()
            }
            2 -> {
                ProfileFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }
}