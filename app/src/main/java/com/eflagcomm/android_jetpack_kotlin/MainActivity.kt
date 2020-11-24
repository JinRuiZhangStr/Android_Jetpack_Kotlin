package com.eflagcomm.android_jetpack_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.eflagcomm.android_jetpack_kotlin.R.color.purple_700
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
        toolbar.setBackgroundColor(resources.getColor(purple_700))
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

        catalogAdapter.setOnItemClickListener(object :OnItemClickListener{
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {

                when (position) {

                    0 -> {

                    }

                    1 -> {

                    }

                    2 -> {

                    }

                    3 -> {

                    }

                    4 -> {

                    }

                    5 -> {

                    }

                    6 -> {

                    }

                    7 -> {

                    }

                    8 -> {

                    }

                    9 -> {

                    }

                }


            }

        })

    }

}