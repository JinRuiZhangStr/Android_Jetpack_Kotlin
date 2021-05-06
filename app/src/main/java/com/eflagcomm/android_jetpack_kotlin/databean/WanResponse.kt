package com.eflagcomm.android_jetpack_kotlin.databean

/**
 *Created by 张金瑞.
 *Data: 2021-1-5
 */
data class WanResponse<T> (val errorCode: Int, val errorMsg: String, val data: T) {
}