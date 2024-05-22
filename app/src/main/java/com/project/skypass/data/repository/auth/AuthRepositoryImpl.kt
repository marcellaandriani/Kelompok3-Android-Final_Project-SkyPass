package com.project.skypass.data.repository.auth

import com.project.skypass.data.datasource.auth.AuthDataStore
import com.project.skypass.data.source.network.model.login.LoginRequestResponse
import com.project.skypass.data.source.network.model.otp.VerifyRequestResponse
import com.project.skypass.data.source.network.model.register.RegisterRequestResponse
import com.project.skypass.utils.ResultWrapper
import com.project.skypass.utils.proceedFlow
import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl(private val dataStore: AuthDataStore): AuthRepository {
    override fun doLogin(email: String, password: String): Flow<ResultWrapper<Boolean>> {
        return proceedFlow {
            (dataStore.doLogin(
                LoginRequestResponse(
                    email = email,
                    password = password
                )
            ).status ?: false) as Boolean
        }
    }

    override fun doRegister(
        name: String,
        email: String,
        password: String,
        phoneNumber: String,
        role: String,
    ): Flow<ResultWrapper<Boolean>> {
        return proceedFlow {
            (dataStore.doRegister(
                RegisterRequestResponse(
                    name = name,
                    email = email,
                    password = password,
                    phoneNumber = phoneNumber,
                    roles = role
                )
            ).status ?: false) as Boolean
        }
    }

    override fun doVerify(email: String, otp: String): Flow<ResultWrapper<Boolean>> {
        return proceedFlow {
            (dataStore.doVerify(
                VerifyRequestResponse(
                    email = email,
                    otp = otp
                )
            ).status ?: false) as Boolean
        }
    }
}