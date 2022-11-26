package com.example.android_project_sns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomnavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomnavigation.selectedItemId = R.id.nav_home

        bottomnavigation.setOnItemSelectedListener { it ->
            when(it.itemId) {
                R.id.nav_home -> {
                    var homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment).commit()
                    true
                }
                R.id.nav_notification -> {
                    var notificationFragment = NotificationFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, notificationFragment).commit()
                    true
                }
                R.id.nav_add -> {
                    true
                }
                R.id.nav_friend -> {
                    var friendFragment =FriendFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, friendFragment).commit()
                    true
                }
                R.id.nav_profile -> {
                    var profileFragment = ProfileFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container, profileFragment).commit()
                    true
                }
                else -> false
            }
        }
    }
}