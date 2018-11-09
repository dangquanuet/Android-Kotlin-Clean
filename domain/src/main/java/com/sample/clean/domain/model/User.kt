package com.sample.clean.domain.model

import com.sample.clean.domain.model.base.Model

data class User(
    val id: String,
    val name: String? = null,
    val username: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null,
    val createdDate: Long? = null
) : Model()
