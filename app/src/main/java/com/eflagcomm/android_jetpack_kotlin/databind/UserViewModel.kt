package com.eflagcomm.android_jetpack_kotlin.databind

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.eflagcomm.android_jetpack_kotlin.BR

/**
 *Created by 张金瑞.
 *Data: 2021-7-22
 */
class UserViewModel (
    private val user: User?
): BaseObservable() {

    @Bindable
    fun getUserName(): String? {
        return user?.userName
    }

    fun  setUserName(userName: String?) {
        user?.userName = userName
        Log.d("setUserName", "setUserName: ${user?.userName}")
        notifyPropertyChanged(BR.userName)
    }
}