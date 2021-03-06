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
    private var currentSecond: MutableLiveData<Int>? = null

    private var second = 0

    private var timer: Timer? = null

    fun getCurrentSecond(): MutableLiveData<Int> {

        if (currentSecond == null) {
            currentSecond = MutableLiveData()
        }

        return currentSecond!!
    }


    fun startTiming() {

        if (timer == null) {

            timer = Timer()
            var timerTask = object : TimerTask() {
                override fun run() {
                    currentSecond?.postValue(second++)

                }
            }
            timer!!.schedule(timerTask, 1000, 1000)
        }

    }
}