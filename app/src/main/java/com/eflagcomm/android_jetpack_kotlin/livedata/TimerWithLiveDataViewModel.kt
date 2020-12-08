package com.eflagcomm.android_jetpack_kotlin.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class TimerWithLiveDataViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }

    /**
     * LiveData 是一个抽象类，不能直接使用，通常使用的是它的子类 MutableLiveData
     */
    private var currentSecond : MutableLiveData<Int> ?= null

    private  var timer : Timer? = null

    fun  getCurrentSecond() : MutableLiveData<Int> {

        if (currentSecond == null) {
            currentSecond = MutableLiveData()
        }

        return currentSecond!!
    }

//    private fun getIntSecond():Int {
//
//    }

    fun startTiming() {

        if (timer == null) {

            timer  = Timer()
            currentSecond?.value = 0
            var timerTask = object : TimerTask() {
                override fun run() {


                }
            }
            timer!!.schedule(timerTask,1000,1000)
        }

    }
}