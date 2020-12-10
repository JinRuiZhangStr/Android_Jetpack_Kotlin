package com.eflagcomm.android_jetpack_kotlin.room

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.eflagcomm.android_jetpack_kotlin.JetpackApplication
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.adapter.DataBaseAdapter
import kotlinx.android.synthetic.main.activity_room.*
import kotlinx.android.synthetic.main.layout_title_bar.*

private const val TAG = "RoomActivity"

class RoomActivity : AppCompatActivity(), View.OnClickListener {

    private var myDataBase: MyDataBase? = null
    private var databaseList = mutableListOf<Student>()
    private var databaseAdapter: DataBaseAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        iniCompant()
        initRecy()
        toolbar.title = "Room 数据库"
        toolbar.setNavigationOnClickListener { v -> finish() }
        btn_insert.setOnClickListener { v ->
            myDataBase?.studentDao()?.insertStudent(Student(0, "asan", 11))
        }
        btn_delet.setOnClickListener(this)
        btn_update.setOnClickListener(this)
        btn_qurey.setOnClickListener(this)
    }

    private fun iniCompant() {

        myDataBase = MyDataBase.databaseInstance

        var studentViewModel = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentViewModel.getLiveDataStudent()
            ?.observe(this, object : Observer<MutableList<Student>> {
                override fun onChanged(t: MutableList<Student>?) {
                    Log.e(TAG, "onChanged: " + t?.size)
                    databaseList.clear()
                    databaseList.addAll(t!!)
                    databaseAdapter?.notifyDataSetChanged()
                }
            })

    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.btn_delet -> {

            }

            R.id.btn_update -> {

            }

            R.id.btn_qurey -> {

            }
        }
    }

    private fun initRecy() {

        val dataLayoutManager = LinearLayoutManager(this)
        recy_database.layoutManager = dataLayoutManager
        databaseAdapter = DataBaseAdapter(R.layout.item_database, databaseList)
        recy_database.adapter = databaseAdapter

    }
}