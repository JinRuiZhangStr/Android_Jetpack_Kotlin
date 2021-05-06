package com.eflagcomm.android_jetpack_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.eflagcomm.android_jetpack_kotlin.R.color.purple_700
import com.eflagcomm.android_jetpack_kotlin.adapter.CatalogAdapter
import com.eflagcomm.android_jetpack_kotlin.hilt.HiltActivity
import com.eflagcomm.android_jetpack_kotlin.lifeCycle.LifeCycleActivity
import com.eflagcomm.android_jetpack_kotlin.livedata.LiveDataActivity
import com.eflagcomm.android_jetpack_kotlin.model.CatalogModel
import com.eflagcomm.android_jetpack_kotlin.room.RoomActivity
import com.eflagcomm.android_jetpack_kotlin.sndemo.LeftSlipListActivity
import com.eflagcomm.android_jetpack_kotlin.sndemo.PcListActivity
import com.eflagcomm.android_jetpack_kotlin.viewmodel.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_title_bar.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initData()
    }

    private fun initView() {
        toolbar.title = "目录"
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

        catalogAdapter.setOnItemClickListener(object : BaseQuickAdapter.OnItemClickListener {
            override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {

                Log.e(TAG, "onItemClick: "+position )
                when (position) {


                    0 -> {

                    }

                    1 -> {

                        intent = Intent(this@MainActivity,LifeCycleActivity::class.java)
                        startActivity(intent)
                    }

                    2 -> {

                    }

                    3 -> {
                        intent = Intent(this@MainActivity,ViewModelActivity::class.java)
                        startActivity(intent)
                    }

                    4 -> {
                        intent = Intent(this@MainActivity,LiveDataActivity::class.java)
                        startActivity(intent)
                    }

                    5 -> {
                        intent = Intent(this@MainActivity,RoomActivity::class.java)
                        startActivity(intent)
                    }

                    6 -> {

                    }

                    7 -> {

                    }

                    8 -> {

                    }

                    9 -> {

                    }

                    10 -> {
                        intent = Intent(this@MainActivity,LeftSlipListActivity::class.java)
                        startActivity(intent)
                    }

                    11 -> {
                        intent = Intent(this@MainActivity,HiltActivity::class.java)
                        startActivity(intent)
                    }

                }


            }

        })


    }

}