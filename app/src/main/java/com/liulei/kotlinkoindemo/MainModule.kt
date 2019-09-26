package com.huirongke.subscribe.di

import com.liulei.kotlinkoindemo.DbService
import com.liulei.kotlinkoindemo.MainActivity
import com.liulei.kotlinkoindemo.MainPresenter
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * @author lll
 * @date on 2019-09-21
 */
object MainModule {
    val mainModule = module {
        //单利
        single {
            DbService()
        }
        //指定注入范围
        scope(named<MainActivity>()) {
            scoped {
                MainPresenter(get(), get())
            }
        }
    }
}