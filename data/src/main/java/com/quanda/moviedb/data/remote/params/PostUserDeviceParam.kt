package com.quanda.moviedb.data.remote.params

import com.google.gson.annotations.SerializedName

data class PostUserDeviceParam(
    @SerializedName("device_uuid") val deviceId: String,
    @SerializedName("firebase_token") val firebaseToken: String
)