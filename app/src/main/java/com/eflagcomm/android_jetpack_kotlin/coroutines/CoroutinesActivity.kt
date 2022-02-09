package com.eflagcomm.android_jetpack_kotlin.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eflagcomm.android_jetpack_kotlin.R
import kotlinx.android.synthetic.main.activity_coroutines.*
import kotlinx.android.synthetic.main.layout_title_bar.*
import kotlinx.coroutines.*

/**
 *Created by 张金瑞.
 *Data: 2021-5-7
 */
class CoroutinesActivity: AppCompatActivity() {

    private val webUrlPath = "file:///android_asset/useapp.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
        initView()
    }

    private fun initView() {
        toolbar.title = "Coroutines 协程"
        toolbar.setNavigationOnClickListener {
            finish()
        }

        btn1.setOnClickListener {
            CoroutineScope(Job() + Dispatchers.Main).launch {
                webview.loadUrl(webUrlPath)
            }
        }
    }
}