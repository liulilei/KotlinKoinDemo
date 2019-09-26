package com.liulei.kotlinkoindemo.base

import android.app.Application
import com.huirongke.subscribe.di.MainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * @author lll
 * @date on 2019-09-26
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(MainModule.mainModule) //需要初始化各个模块的module
        }
    }
}