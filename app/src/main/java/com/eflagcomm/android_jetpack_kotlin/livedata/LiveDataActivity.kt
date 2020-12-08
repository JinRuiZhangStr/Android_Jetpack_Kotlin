package com.eflagcomm.android_jetpack_kotlin.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eflagcomm.android_jetpack_kotlin.R
import kotlinx.android.synthetic.main.layout_title_bar.*

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)
        toolbar.title = "LiveDataActivity"
        toolbar.setNavigationOnClickListener { v -> finish() }
    }
}