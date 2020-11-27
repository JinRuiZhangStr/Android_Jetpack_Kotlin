package com.eflagcomm.android_jetpack_kotlin.lifeCycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

private const val TAG = "LifeCycleServiceObserve"

class LifeCycleServiceObserver : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun startGetLocation() {
        Log.d(TAG, "startGetLocation: ")
    }

    @OnLifecycleEvent (Lifecycle.Event.ON_DESTROY)
    private fun stopGetLocation() {
        Log.d(TAG, "stopGetLocation: ")
    }
}