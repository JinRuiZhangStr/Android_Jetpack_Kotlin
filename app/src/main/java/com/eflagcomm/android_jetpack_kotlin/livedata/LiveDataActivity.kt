package com.eflagcomm.android_jetpack_kotlin.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.eflagcomm.android_jetpack_kotlin.R
import kotlinx.android.synthetic.main.activity_livedata.*
import kotlinx.android.synthetic.main.layout_title_bar.*

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)
        iniCompant()
    }

    private fun iniCompant() {

        //通过viewmodelprovider得到viewmodel
        var timerWithLiveDataViewModel = ViewModelProvider(this)
                    .get(TimerWithLiveDataViewModel::class.java)
        //得到viewmodel中的livedata
        var livedata = timerWithLiveDataViewModel.getCurrentSecond()
        //通过livedata的observe()观察Viewmodel中的数据变化
        livedata.observe(this, object :Observer<Int>{
            override fun onChanged(t: Int?) {
                tv_time.text = "time:${t}"
            }
        })
        //计时开始
        timerWithLiveDataViewModel.startTiming()
    }
}