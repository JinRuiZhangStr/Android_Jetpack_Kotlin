package com.eflagcomm.android_jetpack_kotlin

import android.app.Application
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.providers.NetworkModule
import dagger.hilt.android.HiltAndroidApp
import kotlin.properties.Delegates

@HiltAndroidApp
class JetpackApplication :Application() {

    companion object {
        var instance :JetpackApplication by Delegates.notNull()
        fun  instance() = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}