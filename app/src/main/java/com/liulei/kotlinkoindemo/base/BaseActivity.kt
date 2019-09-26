package com.liulei.kotlinkoindemo.base

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * @author lll
 * @date on 2019-09-26
 */
abstract class BaseActivity<T : BasePresenter> : FragmentActivity() {

    var mPresenter: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayout())
        initInject()
        initViewAndData()
    }

    protected abstract fun initLayout(): Int

    protected abstract fun initInject()

    open fun initViewAndData() {}
}