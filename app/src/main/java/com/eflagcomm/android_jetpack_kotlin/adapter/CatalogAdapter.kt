package com.eflagcomm.android_jetpack_kotlin.adapter

import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.model.CatalogBean
import com.eflagcomm.android_jetpack_kotlin.model.CatalogModel

class CatalogAdapter(@LayoutRes layoutResId: Int, @Nullable catalogList:MutableList<CatalogBean>) : BaseQuickAdapter<CatalogBean, BaseViewHolder>(layoutResId,catalogList) {

    override fun convert(holder: BaseViewHolder, item: CatalogBean) {
        item?.let {
            holder.setText(R.id.tv_catalog,it.cataName)
        }
    }

}