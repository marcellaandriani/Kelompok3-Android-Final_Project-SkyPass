package com.project.skypass.data.source.network.model.register


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class NewUser(
    @SerializedName("createdAt")
    var createdAt: String?,
    @SerializedName("email")
    var email: String?,
    @SerializedName("is_verified")
    var isVerified: Boolean?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("password")
    var password: String?,
    @SerializedName("phone_number")
    var phoneNumber: String?,
    /*@SerializedName("refresh_token")
    var refreshToken: Any?,*/
    @SerializedName("role")
    var role: String?,
    @SerializedName("updatedAt")
    var updatedAt: String?,
    @SerializedName("user_id")
    var userId: String?
)