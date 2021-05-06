package com.eflagcomm.android_jetpack_kotlin.hilt.bind.providers

import com.eflagcomm.android_jetpack_kotlin.ClassifyResponse
import com.eflagcomm.android_jetpack_kotlin.databean.WanResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
interface ServiceApi {

    @GET("/project/tree/json")
    suspend fun listRepos(): WanResponse<MutableList<ClassifyResponse>>
}