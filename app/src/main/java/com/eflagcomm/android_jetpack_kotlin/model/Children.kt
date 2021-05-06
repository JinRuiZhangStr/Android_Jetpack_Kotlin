package com.eflagcomm.android_jetpack_kotlin.model

import android.os.Parcel
import android.os.Parcelable

/**
 * kotlin parcelable序列化对象
 * 以下方法都是必须要实现的
 * 特点：1、序列化对象的时候不持久化；2、它只是将对象保存到内存中，没有I/O操作
 */
data class Children(var id :Int) : Parcelable {


    /**
     * 序列化过程  存值
     */
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(id)
    }


    override fun describeContents(): Int {
        return 0
    }

    /**
     * 反序列化  取值
     * CREATOR 配合 constructor（parcel：Parcel）实现反序列化，转化为对象本身
     */
    companion object CREATOR : Parcelable.Creator<Children> {
        override fun createFromParcel(source: Parcel?): Children {
            return Children(source!!)
        }

        override fun newArray(size: Int): Array<Children?> {
            return arrayOfNulls(size)
        }

    }

    constructor(parcel: Parcel) : this(parcel.readInt()) {

    }
}



