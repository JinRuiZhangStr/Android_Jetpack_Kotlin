package com.eflagcomm.android_jetpack_kotlin.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

/**
 * ViewModel 中最好不要传 Context或带有Context引用的对象，容易引起内存泄漏，如果必须要使用，请继承 AndroidViewModel
 * AndoridViewModle 继承ViewModel, 并接受Application作为Context
 */
private const val TAG = "TimeViewModel"

class TimeViewModel : ViewModel() {

    private  var timer :Timer? = null
    private var currentSecond = 0

    /**
     * 当ViewModel不再需要，即绑定的Activity被销毁时，该方法会被系统调用
     */
    override fun onCleared() {
        super.onCleared()
        Log.e(TAG, "onCleared: ")
        timer?.cancel()
    }

    fun startTiming() {

        if (timer == null) {

            timer  = Timer()

            var timerTask = object : TimerTask() {
                override fun run() {
                    currentSecond ++

                    timeListener!!.onTimeChanged(currentSecond.toString())

                }
            }
            timer!!.schedule(timerTask,1000,1000)
        }

    }

    interface OnTimeChangeListener {
        fun onTimeChanged(second: String)
    }

    private  var timeListener: OnTimeChangeListener  ?= null

    fun setTimeChangeListener(listener:OnTimeChangeListener) {
        timeListener = listener
    }
}