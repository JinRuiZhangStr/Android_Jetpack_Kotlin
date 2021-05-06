package com.eflagcomm.android_jetpack_kotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
@Parcelize
data class ClassifyResponse(
    val children: List<Children>?,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
) : Parcelable

data class Children(
    val children: List<Any>?,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val userControlSetTop: Boolean,
    val visible: Int
) : Serializable