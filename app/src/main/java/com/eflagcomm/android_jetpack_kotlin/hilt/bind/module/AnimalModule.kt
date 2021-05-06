package com.eflagcomm.android_jetpack_kotlin.hilt.bind.module

import com.eflagcomm.android_jetpack_kotlin.hilt.bind.IAnimal
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.Monkey
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.Sheep
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.Tiger
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier.bindMonkeyAnimal
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier.bindSheepAnimal
import com.eflagcomm.android_jetpack_kotlin.hilt.bind.qualifier.bindTigerAnimal
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */

/*
@Binds
abstract fun bindMonkey(monkey: Monkey):IAnimal 去告诉了Hilt要用Monkey这个实现，
作用范围是@InstallIn(ActivityComponent::class) 这个ActivityComponent表示所有Activity。

@InstallIn，就是安装到的意思。那么 @InstallIn(ActivityComponent::class)，就是把这个模块安装到 Activity 组件当中。
既然是安装到了 Activity 组件当中，那么自然在 Activity 中是可以使用由这个模块提供的所有依赖注入实例。
另外，Activity 中包含的 Fragment 和 View 也可以使用，但是除了 Activity、Fragment、View 之外的其他地方就无法使用了。
注意：Hilt 不会为广播接收器生成组件，因为 Hilt 直接从 ApplicationComponent 注入广播接收器。

@bindMonkeyAnimal 表示使用Monkey实现，@bindTigerAnimal使用Tiger实现，@bindSheepAnimal使用Sheep实现，
接着在使用到IAnimal注入的地方也需要标明具体是用何种实现。

总结：
由于需要注入的是接口（IAnimal），由于不知道使用的具体是哪个实现类，所以无法在构造器里面注入，
这时候我们考虑用@Module，并考虑用@Binds 来告知具体用何种实现。
@Binds必须是抽象类里；修饰抽象方法；并且返回值是接口类型 。
@InstallIn(ActivityComponent::class) 表示作用的组件是Activity。

 */

@Module
@InstallIn(ActivityComponent::class)
abstract class AnimalModule {
    @bindMonkeyAnimal
    @Binds
    abstract fun bindMonkey(monkey: Monkey): IAnimal

    @bindTigerAnimal
    @Binds
    abstract fun bindTiger(tiger: Tiger): IAnimal

    @bindSheepAnimal
    @Binds
    abstract fun bindSheep(sheep: Sheep): IAnimal
}