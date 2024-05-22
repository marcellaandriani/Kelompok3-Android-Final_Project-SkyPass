package com.project.skypass.data.source.network.model.register


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class RegisterRequestResponse(
    @SerializedName("email")
    var email: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("password")
    var password: String?,
    @SerializedName("phone_number")
    var phoneNumber: String?,
    @SerializedName("roles")
    var roles: String?
)