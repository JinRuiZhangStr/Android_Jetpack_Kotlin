package com.eflagcomm.android_jetpack_kotlin.hilt.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.IAnimal
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier.bindTigerAnimal
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_userview.view.*
import javax.inject.Inject

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
/*
该View里面表明用@bindTigerAnimal Tiger实现。
 */
@AndroidEntryPoint
class AnimalView: LinearLayout {

    @bindTigerAnimal
    @Inject lateinit var animal:IAnimal

    constructor(context: Context): this(context,null,0)
    constructor(context: Context,attrs: AttributeSet?): this(context,attrs,0)
    constructor(context: Context,attrs: AttributeSet?,defStyleAttr: Int = 0): super(context,attrs, 0)

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_userview,this)
        tv_name.text = animal.animalName()
    }
}