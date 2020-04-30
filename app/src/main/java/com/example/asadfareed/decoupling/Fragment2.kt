package com.example.asadfareed.decoupling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.asadfareed.decoupling.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_fragment.*


class Fragment2() : Fragment(),ComInterface {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.layout_fragment, container, false)
        return view
    }

    override fun setText(text: String) {
        fragment2.tv_text.text=text
    }
}