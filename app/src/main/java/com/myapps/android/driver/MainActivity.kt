package com.myapps.android.driver

import android.nfc.Tag
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var isProfileFragment = true
    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val change = findViewById<ImageView>(R.id.imageView)
//        showProfileFragment()
//        change.setOnClickListener {
//            if(isProfileFragment) {
//                showPaymentFragment()
//            } else {
//                showProfileFragment()
//            }
//        }
    }

//    private fun showProfileFragment(){
//        val transaction = manager.beginTransaction()
//        val fragment = ProfileFragment()
//        transaction.replace(R.id.fragment_holder, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//        isProfileFragment = true
//    }

//    private fun showPaymentFragment(){
//        val transaction = manager.beginTransaction()
//        val fragment = ProfileDetailsFragment()
//        transaction.replace(R.id.fragment_holder, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//        isProfileFragment = false
//    }
}
