package com.eflagcomm.android_jetpack_kotlin.lifeCycle

import android.app.Activity
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

private const val TAG = "MyLocationListener"

class MyLocationListener(context: Activity,onLocationChangedListener: OnLocationChangedListener) : LifecycleObserver {

    /**
     * 当Activity 执行 onResume生命周期时，该方法会被自动调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun startGetLocation() {
        Log.d(TAG, "startGetLocation: ")
    }

    /**
     * Activity 执行 onPause生命周期时，该方法会被自动调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun stopGetLocation() {
        Log.d(TAG, "stopGetLocation: ")
    }


    interface OnLocationChangedListener {
        fun onChanged(latitude:Double, longitude:Double)
    }
}