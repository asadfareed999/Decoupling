package com.example.asadfareed.decoupling

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var interfaceCom:ComInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(Fragment1(),R.id.fragment1)
        loadFragment(Fragment2(),R.id.fragment2)
        // init interface com
        btn_enter.setOnClickListener {
            Log.i("Sent",et_text.text.toString())
            interfaceCom.setText(et_text.text.toString())
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        interfaceCom = fragment as  ComInterface
    }

    fun loadFragment(fragment: Fragment, fragment1: Int) {
        val transaction = this.supportFragmentManager.beginTransaction()
        transaction.replace(fragment1, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
