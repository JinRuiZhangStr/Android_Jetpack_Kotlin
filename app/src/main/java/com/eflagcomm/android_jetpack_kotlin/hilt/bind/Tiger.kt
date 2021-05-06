package com.eflagcomm.android_jetpack_kotlin.hilt.bind

import android.util.Log
import javax.inject.Inject

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
class Tiger @Inject constructor(): IAnimal {
    override fun eat() {
        Log.d("Tiger===","eat meat")
    }

    override fun animalName(): String {
        return "I'am tiger"
    }
}