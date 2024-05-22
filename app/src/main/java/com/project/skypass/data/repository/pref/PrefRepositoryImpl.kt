package com.project.skypass.data.repository.pref

import com.project.skypass.data.datasource.preference.PrefDataSource

class PrefRepositoryImpl(private val dataSource: PrefDataSource): PrefRepository {
    override fun isFirstRun(): Boolean {
        return dataSource.isFirstRun()
    }

    override fun setFirstRun(isFirstRun: Boolean) {
        return dataSource.setFirstRun(isFirstRun)
    }

    override fun isLogin(): Boolean {
        return dataSource.isLogin()
    }

    override fun setLogin(isLogin: Boolean) {
        return dataSource.setLogin(isLogin)
    }

    override fun getToken(): String {
        return dataSource.getToken()
    }

    override fun setToken(token: String) {
        return dataSource.setToken(token)
    }
}