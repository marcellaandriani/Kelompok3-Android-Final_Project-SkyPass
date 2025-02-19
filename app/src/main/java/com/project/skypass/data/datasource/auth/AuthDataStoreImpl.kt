package com.project.skypass.data.datasource.auth

import com.project.skypass.data.source.network.model.login.LoginRequestResponse
import com.project.skypass.data.source.network.model.login.LoginResponse
import com.project.skypass.data.source.network.model.otp.VerifyRequestResponse
import com.project.skypass.data.source.network.model.otp.VerifyResponse
import com.project.skypass.data.source.network.model.register.RegisterRequestResponse
import com.project.skypass.data.source.network.model.register.RegisterResponse
import com.project.skypass.data.source.network.service.ApiService

class AuthDataStoreImpl(private val service: ApiService): AuthDataStore {
    override suspend fun doRegister(payload: RegisterRequestResponse): RegisterResponse {
        return service.doRegister(payload)
    }

    override suspend fun doVerify(payload: VerifyRequestResponse): VerifyResponse {
        return service.doVerify(payload)
    }

    override suspend fun doLogin(payload: LoginRequestResponse): LoginResponse {
        return service.doLogin(payload)
    }
}