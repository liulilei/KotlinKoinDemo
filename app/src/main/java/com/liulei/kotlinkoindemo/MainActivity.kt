package com.liulei.kotlinkoindemo

import com.liulei.kotlinkoindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.scope.currentScope

class MainActivity : BaseActivity<MainPresenter>() {

    override fun initLayout(): Int {
        return R.layout.activity_main
    }

    override fun initInject() {
        mPresenter = currentScope.get()//get()
    }

    override fun initViewAndData() {
        textView.setOnClickListener {
            mPresenter?.getData("调用presenter")
        }
    }

}
