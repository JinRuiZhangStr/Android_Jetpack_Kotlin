package com.eflagcomm.android_jetpack_kotlin.adapter

import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.room.Student

class DataBaseAdapter(@LayoutRes layoutId: Int,@Nullable studentList: MutableList<Student>) :BaseQuickAdapter<Student,BaseViewHolder>(layoutId,studentList) {
    override fun convert(holder: BaseViewHolder, item: Student) {
        holder.setText(R.id.tv_database,item.name)
    }
}