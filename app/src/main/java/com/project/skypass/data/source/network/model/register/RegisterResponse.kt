package com.project.skypass.data.source.network.model.register


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class RegisterResponse(
    @SerializedName("data")
    var `data`: Data?,
    @SerializedName("status")
    var status: String?
)