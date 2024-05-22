package com.project.skypass.data.source.network.model.register


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Data(
    @SerializedName("email")
    var email: String?,
    @SerializedName("newUser")
    var newUser: NewUser?
)