package com.example.asadfareed.decoupling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.asadfareed.decoupling.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_fragment.*
import kotlinx.android.synthetic.main.layout_fragment.view.*


class Fragment2() : Fragment(),ComInterface {

    private lateinit var textView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.layout_fragment, container, false)
        textView=view.findViewById(R.id.tv_text)
        return view
    }

    override fun setText(text: String) {
        textView.text=text
        /*val fragmentManager=this.activity?.supportFragmentManager
        fragmentManager?.findFragmentById(R.id.fragment1)?.tv_text?.text=text*/
    }
}