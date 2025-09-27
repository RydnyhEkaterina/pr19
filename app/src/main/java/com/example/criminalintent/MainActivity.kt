package com.example.criminalintent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            currentFragment = CrimeFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, currentFragment)
                .commit()
        }
    }
}