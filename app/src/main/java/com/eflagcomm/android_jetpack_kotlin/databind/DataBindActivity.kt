package com.eflagcomm.android_jetpack_kotlin.databind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.databinding.ActivityDataBindBinding
import kotlinx.android.synthetic.main.layout_title_bar.*

class DataBindActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_bind)
        val activityDataBindBinding =  DataBindingUtil.setContentView<ActivityDataBindBinding >(this,R.layout.activity_data_bind)
        activityDataBindBinding.userViewModel = UserViewModel2(User("Jack"))

        toolbar.title = "DataBindActivity"
        toolbar.setNavigationOnClickListener { v -> finish() }
    }
}