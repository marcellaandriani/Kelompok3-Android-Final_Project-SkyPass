package com.project.skypass.data.repository.auth

import com.project.skypass.utils.ResultWrapper
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    fun doLogin(
        email: String,
        password: String
    ): Flow<ResultWrapper<Boolean>>

    fun doRegister(
        name: String,
        email: String,
        password: String,
        phoneNumber: String,
        role: String
    ): Flow<ResultWrapper<Boolean>>

    fun doVerify(
        email: String,
        otp: String
    ): Flow<ResultWrapper<Boolean>>
}