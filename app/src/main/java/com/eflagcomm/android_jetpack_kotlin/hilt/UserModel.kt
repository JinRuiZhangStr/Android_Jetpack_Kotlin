package com.eflagcomm.android_jetpack_kotlin.hilt

import android.os.Parcel
import android.os.Parcelable
import javax.inject.Inject

/**
 *Created by 张金瑞.
 *Data: 2021-4-14
 */
class UserModel @Inject constructor(): Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<UserModel> {
        override fun createFromParcel(parcel: Parcel): UserModel {
            return UserModel(parcel)
        }

        override fun newArray(size: Int): Array<UserModel?> {
            return arrayOfNulls(size)
        }
    }

    var id = 0
    var name = ""

    override fun toString(): String {
        return "UserModel(name=$name id=$id)"
    }
}