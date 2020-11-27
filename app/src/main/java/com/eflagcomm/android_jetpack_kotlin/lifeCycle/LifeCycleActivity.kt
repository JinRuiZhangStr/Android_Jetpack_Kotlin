package com.eflagcomm.android_jetpack_kotlin.lifeCycle

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import com.eflagcomm.android_jetpack_kotlin.R

class LifeCycleActivity : AppCompatActivity(),LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_home)

        var myLocationListener = MyLocationListener(this,object :MyLocationListener.OnLocationChangedListener{
            override fun onChanged(latitude: Double, longitude: Double) {

            }

        })
        //将观察者与被观察者绑定
        lifecycle.addObserver(myLocationListener)
    }

}