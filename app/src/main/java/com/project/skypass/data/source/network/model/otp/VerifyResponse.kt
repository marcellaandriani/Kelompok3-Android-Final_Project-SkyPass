package com.project.skypass.data.source.network.model.otp


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class VerifyResponse(
    @SerializedName("data")
    var data: List<Data>?,
    @SerializedName("message")
    var message: String?,
    @SerializedName("status")
    var status: String?
)