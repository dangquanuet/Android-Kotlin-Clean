package com.quanda.moviedb.data.remote.response

import com.google.gson.annotations.SerializedName
import com.quanda.moviedb.data.remote.Error

class BaseErrorResponse(
    @SerializedName("code") var code: Int? = null,
    @SerializedName("message") val message: String? = null,
    @SerializedName("errors") val errors: List<Error>? = null
)