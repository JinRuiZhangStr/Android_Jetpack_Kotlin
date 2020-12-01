package com.eflagcomm.android_jetpack_kotlin.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.eflagcomm.android_jetpack_kotlin.R
import kotlinx.android.synthetic.main.activity_viewmodel.*
import kotlinx.android.synthetic.main.layout_title_bar.*

class ViewModelActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        toolbar.title = "ViewModelActivity"
        toolbar.setNavigationOnClickListener { v -> finish() }

        var timeViewModel = ViewModelProvider(this).get(TimeViewModel::class.java)
        timeViewModel.setTimeChangeListener(object :TimeViewModel.OnTimeChangeListener{
            override fun onTimeChanged(second: String) {
                runOnUiThread {
                    tv_time.text = second
                }
            }

        })

        timeViewModel.startTiming()
    }
}