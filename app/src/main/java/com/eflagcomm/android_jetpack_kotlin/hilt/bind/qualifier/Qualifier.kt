package com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier

import javax.inject.Qualifier

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindMonkeyAnimal

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindTigerAnimal

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class bindSheepAnimal
