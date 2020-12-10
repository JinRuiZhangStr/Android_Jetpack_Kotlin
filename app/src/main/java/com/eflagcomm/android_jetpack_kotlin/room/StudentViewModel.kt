package com.eflagcomm.android_jetpack_kotlin.room

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.eflagcomm.android_jetpack_kotlin.JetpackApplication

class StudentViewModel : ViewModel() {
    private var myDatabase :MyDataBase? = null

    private var livedataStudent : LiveData<MutableList<Student>>? =null

    init {
        myDatabase = MyDataBase.databaseInstance
        livedataStudent = myDatabase?.studentDao()?.queryStudent()
    }

    fun getLiveDataStudent() :LiveData<MutableList<Student>>? {

        return livedataStudent
    }
}