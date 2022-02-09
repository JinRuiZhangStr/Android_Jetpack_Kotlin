package com.eflagcomm.android_jetpack_kotlin.databind

import android.util.Log
import androidx.databinding.ObservableField

/**
 *Created by 张金瑞.
 *Data: 2021-7-22
 */
class UserViewModel2(
    user: User?
) {
    private var observableField: ObservableField<User> ?= null

    init {
        observableField = ObservableField()
        observableField?.set(user)
    }

    fun getUserName(): String? {

        return observableField?.get()?.userName
    }

    fun setUserName(userName: String?) {
        observableField?.get()?.userName = userName
        Log.d("setUserName", "setUserName: ${observableField?.get()?.userName}")
    }
}