package com.eflagcomm.android_jetpack_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eflagcomm.android_jetpack_kotlin.adapter.CatalogAdapter
import com.eflagcomm.android_jetpack_kotlin.model.CatalogModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initData()
    }

    private fun initView() {
        toolbar.title = "目录"
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
        toolbar.setBackgroundColor(resources.getColor(R.color.purple_700))
        //设置导航图标要在 setSupportActionBar 之后
//        setSupportActionBar(toolbar)
        toolbar.navigationIcon = resources.getDrawable(R.mipmap.ic_catalog)
    }

    private fun initData() {
        val catalogList = CatalogModel.createCatalog()
        val dataLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = dataLayoutManager
        var catalogAdapter = CatalogAdapter(R.layout.item_catalog,catalogList)
        recy.adapter = catalogAdapter
    }

}