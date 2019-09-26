package com.liulei.kotlinkoindemo

/**
 * @author lll
 * @date on 2019-09-26
 */
class DbService {
    fun getData(date: String): String {
        return "$date ---->  koin"
    }
}