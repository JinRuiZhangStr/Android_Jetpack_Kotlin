package com.eflagcomm.android_jetpack_kotlin.sndemo

import android.graphics.Canvas
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback
import com.chad.library.adapter.base.listener.OnItemDragListener
import com.chad.library.adapter.base.listener.OnItemSwipeListener
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.adapter.LiftSlipAdapter
import kotlinx.android.synthetic.main.activity_left_slip.*
import kotlinx.android.synthetic.main.layout_title_bar.*

/**
 *Created by 张金瑞.
 *Data: 2021-1-29
 */
class LeftSlipListActivity: AppCompatActivity() {

    private var arrayList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_slip)
        toolbar.title = "左滑删除"
        toolbar.setNavigationOnClickListener { v -> finish() }

        for (i in 1..10) {
            arrayList.add(" 数据 ${i}")
        }

        var liftSlipAdapter = LiftSlipAdapter(R.layout.item_catalog,arrayList)
        recy.adapter = liftSlipAdapter
        val dataLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = dataLayoutManager

        val onItemDragListener = object : OnItemDragListener {
            override fun onItemDragStart(viewHolder: RecyclerView.ViewHolder?, pos: Int) {

            }

            override fun onItemDragMoving(
                source: RecyclerView.ViewHolder?,
                from: Int,
                target: RecyclerView.ViewHolder?,
                to: Int
            ) {
            }

            override fun onItemDragEnd(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
            }

        }

        val onItemSwipeListener = object : OnItemSwipeListener{
            override fun onItemSwipeStart(viewHolder: RecyclerView.ViewHolder?, pos: Int) {

            }

            override fun clearView(viewHolder: RecyclerView.ViewHolder?, pos: Int) {

            }

            override fun onItemSwiped(viewHolder: RecyclerView.ViewHolder?, pos: Int) {

            }

            override fun onItemSwipeMoving(
                canvas: Canvas?,
                viewHolder: RecyclerView.ViewHolder?,
                dX: Float,
                dY: Float,
                isCurrentlyActive: Boolean
            ) {

            }

        }

        var itemDragAndSwipeListener = ItemDragAndSwipeCallback(liftSlipAdapter)
        var itemTouchHelper = ItemTouchHelper(itemDragAndSwipeListener)

        itemTouchHelper.attachToRecyclerView(recy)

        liftSlipAdapter.enableSwipeItem()
        liftSlipAdapter.setOnItemSwipeListener(onItemSwipeListener)

    }

}