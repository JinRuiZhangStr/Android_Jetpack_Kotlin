package com.eflagcomm.android_jetpack_kotlin.hilt.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.hilt.UserModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_userview.view.*
import javax.inject.Inject

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
@AndroidEntryPoint
class UserView: LinearLayout {
    @Inject lateinit var user: UserModel

    constructor(context: Context):this(context,null,0)
    constructor(context: Context, attrs:AttributeSet?):this(context,attrs,0)
    constructor(context: Context, attrs:AttributeSet?,defStyleAttr:Int=0):super(context,attrs,0)

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_userview,this)
        user.name = "UserView UserName"
        tv_name.text = user.name
    }
}