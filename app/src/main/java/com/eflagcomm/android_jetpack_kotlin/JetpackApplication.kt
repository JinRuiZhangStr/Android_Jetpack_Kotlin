package com.eflagcomm.android_jetpack_kotlin

import android.app.Application
import kotlin.properties.Delegates

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