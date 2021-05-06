package com.eflagcomm.android_jetpack_kotlin.adapter

import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import com.chad.library.adapter.base.BaseItemDraggableAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.model.CatalogBean

/**
 *Created by 张金瑞.
 *Data: 2021-1-29
 */
class LiftSlipAdapter(@LayoutRes layoutResId: Int, @Nullable catalogList:MutableList<String>): BaseItemDraggableAdapter<String,BaseViewHolder>(layoutResId,catalogList) {
    override fun convert(helper: BaseViewHolder, item: String?) {
        helper.setText(R.id.tv_catalog,item)
    }
}