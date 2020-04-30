package com.example.asadfareed.decoupling

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_fragment.*
import kotlinx.android.synthetic.main.layout_fragment.view.*
import kotlinx.android.synthetic.main.layout_fragment.view.tv_text


class Fragment1() : Fragment() ,ComInterface{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.layout_fragment, container, false)
        return view
    }

    override fun setText(text: String) {
        Log.i("Text",text)
    fragment1.tv_text.text=text
    }
}