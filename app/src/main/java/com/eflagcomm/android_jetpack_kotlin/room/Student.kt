package com.eflagcomm.android_jetpack_kotlin.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class Student(var id: Int?,var name: String?,var age: Int?) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id",typeAffinity = ColumnInfo.INTEGER)
    var mId :Int? = id
    @ColumnInfo(name = "name",typeAffinity = ColumnInfo.TEXT)
    var mName :String?= name
    @ColumnInfo(name = "age",typeAffinity = ColumnInfo.INTEGER)
    var mAge :Int? = age


}