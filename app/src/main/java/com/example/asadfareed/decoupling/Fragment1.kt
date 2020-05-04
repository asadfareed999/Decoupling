package com.example.asadfareed.decoupling

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_fragment.*
import kotlinx.android.synthetic.main.layout_fragment.view.*


class Fragment1 : Fragment() ,ComInterface{

    private lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.layout_fragment, container, false)
        textView=view.findViewById(R.id.tv_text)
        return view
    }

    override fun setText(text: String) {
        Log.i("Text",text)
        //textView=this.requireView().findViewById(R.id.tv_text)
        //textView.text=text
        /*val textView=this.view?.findViewById<TextView>(R.id.tv_text)
        textView?.tv_text?.text=text*/
        Toast.makeText(activity," "+text,Toast.LENGTH_LONG).show()
        val fragmentManager=this.activity?.supportFragmentManager
        fragmentManager?.findFragmentById(R.id.fragment1)?.tv_text?.text=text
    }
}