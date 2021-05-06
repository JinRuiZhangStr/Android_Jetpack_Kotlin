package com.eflagcomm.android_jetpack_kotlin.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 *Created by 张金瑞.
 *Data: 2021-1-29
 * @sse #String(byte[], java.nio.charset.Charset)
 */
class MyViewPagerAdapter(private val fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
}