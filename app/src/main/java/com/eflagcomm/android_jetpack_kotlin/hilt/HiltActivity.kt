package com.eflagcomm.android_jetpack_kotlin.hilt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eflagcomm.android_jetpack_kotlin.R
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.IAnimal
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.providers.ServiceApi
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier.bindMonkeyAnimal
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_hilt.*
import kotlinx.android.synthetic.main.layout_title_bar.*
import kotlinx.coroutines.*
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

/**
 *Created by 张金瑞.
 *Data: 2021-4-14
 */
/*
需要注意的是，如果使用 @AndroidEntryPoint 为某个 Android 类添加注释，
则还必须为依赖于该类的 Android 类添加注释。
例如，如果您为某个 Fragment 添加注释，
则还必须为使用该 Fragment 的所有 Activity 添加注释。
 */
private const val TAG = "HiltActivity"
@AndroidEntryPoint
class HiltActivity: AppCompatActivity(),CoroutineScope by MainScope() {

    @Inject
    lateinit var userModel: UserModel

    /**
     * @Binds 使用
     */
    @bindMonkeyAnimal
    @Inject lateinit var animal:IAnimal

    @Inject lateinit var serviceApi: ServiceApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)
        toolbar.title= "hilt注解依赖"
        toolbar.setNavigationOnClickListener { _ -> finish() }
        initData()
    }

    private fun initData(): Unit {
        userModel.name = "zjrDev"
        userModel.id = 1

        val log = userModel.toString()
        Log.e(TAG, "initData: $log" )

        tv_animal.text = animal.animalName()

        btn_provide.setOnClickListener {
                launch(Dispatchers.Main) {
                    val repos = serviceApi.listRepos()
                    tv_animal.text = repos.data[0].name
                }
        }
    }

    override fun onDestroy() {
        cancel()
        super.onDestroy()
    }
}