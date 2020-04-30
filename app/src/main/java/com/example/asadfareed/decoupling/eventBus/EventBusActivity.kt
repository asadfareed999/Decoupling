package com.example.asadfareed.decoupling.eventBus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asadfareed.decoupling.R
import kotlinx.android.synthetic.main.activity_event_bus.*
import org.greenrobot.eventbus.EventBus

class EventBusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_bus)
        btn_enter.setOnClickListener {
            EventBus.getDefault().post(TextEvent(et_text.text.toString()))
        }
    }

}
