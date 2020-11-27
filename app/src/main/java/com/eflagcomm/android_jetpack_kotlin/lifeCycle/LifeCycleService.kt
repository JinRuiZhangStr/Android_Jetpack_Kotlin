package com.eflagcomm.android_jetpack_kotlin.lifeCycle

import android.app.Service
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleService

class LifeCycleService : LifecycleService() {

    private lateinit var myServiceObserver : LifeCycleServiceObserver

    init {
        myServiceObserver = LifeCycleServiceObserver()
        lifecycle.addObserver(myServiceObserver)
    }
}