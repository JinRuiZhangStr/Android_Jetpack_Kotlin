package com.eflagcomm.android_jetpack_kotlin.hilt.bind

import android.util.Log
import javax.inject.Inject

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
class Sheep @Inject constructor() : IAnimal {
    override fun eat() {
        Log.d("sheep===","eat grass")
    }

    override fun animalName(): String {
        return "I'am sheep"
    }
}