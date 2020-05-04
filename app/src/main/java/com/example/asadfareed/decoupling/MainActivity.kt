package com.example.asadfareed.decoupling

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var  callback: ComInterface
    private lateinit var  callback2: ComInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentOne=Fragment1()
        val fragmentTwo=Fragment2()
        loadFragment(Fragment1(),R.id.fragment1)
        loadFragment(Fragment2(),R.id.fragment2)
        callback=fragmentOne
        callback2=fragmentTwo
        // init interface com
        btn_enter.setOnClickListener {
            Log.i("Sent",et_text.text.toString())
            callback.setText(et_text.text.toString())
            callback2.setText(et_text.text.toString())
        }
    }

    fun loadFragment(fragment: Fragment, fragment1: Int) {
        val transaction = this.supportFragmentManager.beginTransaction()
        transaction.replace(fragment1, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
