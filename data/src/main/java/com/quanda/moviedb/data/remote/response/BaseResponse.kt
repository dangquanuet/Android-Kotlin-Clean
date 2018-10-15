package com.quanda.moviedb.data.remote.response

import com.google.gson.annotations.SerializedName
import com.quanda.moviedb.data.remote.Error

open class BaseResponse(
    @SerializedName("total") val total: Int? = null,
    @SerializedName("max_page") val maxPage: Int? = null,
    @SerializedName("message") val message: String? = null,
    @SerializedName("errors") val errors: List<Error>? = null
)
