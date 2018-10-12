package com.quanda.moviedb.data.remote.response

import com.google.gson.annotations.SerializedName
import com.quanda.moviedb.data.remote.Error

open class BaseResponse(
        @field: SerializedName("total") val total: Int? = null,
        @field: SerializedName("max_page") val maxPage: Int? = null,
        @field: SerializedName("message") val message: String? = null,
        @field: SerializedName("errors") val errors: List<Error>? = null
)
