package com.eflagcomm.android_jetpack_kotlin.hilt.bind.providers

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 *Created by 张金瑞.
 *Data: 2021-4-22
 */

/*
由于Retrofit使用到第三方的类，无法在构造器里注入，所以使用@Module跟@Provides。
由于全局中只有一个Retrofit就行，所以我们@InstallIn(ApplicationComponent::class) 使用的是ApplicationComponent，
并且在提供provideRetrofit的方法上面添加@Singleton表示单例唯一。
下面provideOkHttpClient方法是OkHttpClient。
provideRetrofit方法是提供Retrofit
providerGitHubService方法是提供我们定义的GitHubService
下面写法就是@Provides的用法，当某个类不能用构造函数注入，并且该类又不归我们所有，这种情况一般会用@Providers去实现注入，
有别于@Binds是，@Provides是直接写正常的方法函数，并且在函数里返回具体的实例。而@Binds确实抽象类抽象函数。

 */
@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        return OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .build()

    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://36.110.84.86:7071/nm-app-store/")
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideServiceApi(retrofit: Retrofit): ServiceApi{
        return retrofit.create(ServiceApi::class.java)
    }
}