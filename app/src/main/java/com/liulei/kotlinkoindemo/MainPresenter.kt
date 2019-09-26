package com.liulei.kotlinkoindemo

import android.content.Context
import android.widget.Toast
import com.liulei.kotlinkoindemo.base.BasePresenter

/**
 * @author lll
 * @date on 2019-09-26
 */
class MainPresenter(var context: Context, var dbService: DbService) : BasePresenter {
    fun getData(data: String) {
        Toast.makeText(context, dbService.getData(data), Toast.LENGTH_SHORT).show()
    }
}