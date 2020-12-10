package com.eflagcomm.android_jetpack_kotlin.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.eflagcomm.android_jetpack_kotlin.JetpackApplication

private const val DATABASE_NAME = "jetpack_db"

/**
 * database 标签 -用于告诉系统这是Room数据库对象。
 * entites 属性 -用于指定该数据库有哪些表，若需要建立多张表，则表名（即类名）要用逗号隔开
 * version 属性 -用于指定数据库版本号
 */
@Database(entities = [Student::class],version = 1)
abstract class MyDataBase : RoomDatabase() {

    companion object getInstance {
        @Volatile
        var databaseInstance :MyDataBase ?= null

        fun getInstance() :MyDataBase {

            if (databaseInstance == null) {
                synchronized(MyDataBase::class.java){
                    if (databaseInstance == null) {
                        databaseInstance = Room.databaseBuilder(JetpackApplication.instance(),MyDataBase::class.java,
                            DATABASE_NAME)
                            .allowMainThreadQueries()
                            .build()
                    }
                }
            }

            return databaseInstance!!

        }

    }

    private object Single {
        val sin :MyDataBase = Room.databaseBuilder(JetpackApplication.instance(),MyDataBase::class.java,
            DATABASE_NAME).build()
    }

    abstract fun studentDao() : StudentDao
}