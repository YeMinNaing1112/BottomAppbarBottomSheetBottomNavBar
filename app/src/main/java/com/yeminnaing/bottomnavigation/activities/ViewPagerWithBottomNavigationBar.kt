package com.yeminnaing.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.yeminnaing.bottomnavigation.R
import com.yeminnaing.bottomnavigation.adapters.VIewPagerNavigationAdapter
import kotlinx.android.synthetic.main.activity_view_pager_with_bottom_navigation_bar.*

class ViewPagerWithBottomNavigationBar :
    AppCompatActivity(R.layout.activity_view_pager_with_bottom_navigation_bar) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewPagerBottomNavigation.adapter = VIewPagerNavigationAdapter(this);
//        viewPagerBottomNavigation.currentItem = 0
        viewPagerBottomNavigation.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> bottom_navigation.selectedItemId = R.id.action_home
                    1 -> bottom_navigation.selectedItemId = R.id.action_noti
                    2 -> bottom_navigation.selectedItemId = R.id.action_profile
                }
            }
        })
        bottom_navigation.setOnItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.action_home -> {
                    viewPagerBottomNavigation.currentItem = 0
                    true
                }
                R.id.action_noti -> {
                    viewPagerBottomNavigation.currentItem = 1
                    true

                }
                R.id.action_profile -> {
                    viewPagerBottomNavigation.currentItem = 2
                    true

                }

            }
           true
        }
    }
}