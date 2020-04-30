package com.example.asadfareed.decoupling.eventBus

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.asadfareed.decoupling.R
import kotlinx.android.synthetic.main.activity_event_bus.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_fragment.*
import kotlinx.android.synthetic.main.layout_fragment.view.*
import kotlinx.android.synthetic.main.layout_fragment.view.tv_text
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode


class Fragment4() : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.layout_fragment, container, false)
        return view
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public fun onTextEvent(textEvent: TextEvent){
        fragment4.tv_text.text=textEvent.text
    }


    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        EventBus.getDefault().unregister(this)
        super.onStop()
    }
}