package com.yeminnaing.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.yeminnaing.bottomnavigation.R
import com.yeminnaing.bottomnavigation.fragments.HomeFragment
import com.yeminnaing.bottomnavigation.fragments.NotificationFragment
import com.yeminnaing.bottomnavigation.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        swapFragments(HomeFragment())

        bottom_nav.setOnItemSelectedListener { menuItem : MenuItem ->
            when(menuItem.itemId) {
                R.id.action_home -> {
                    swapFragments(HomeFragment())
                    true
                }
                R.id.action_noti -> {
                    swapFragments(NotificationFragment())
                    true
                }
                R.id.action_profile -> {
                    swapFragments(ProfileFragment())
                    true
                }
                else -> {false}
            }

        }

    }
    private fun swapFragments(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container,fragment)
            .commit()
    }
}