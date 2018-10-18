package com.sample.clean.data.model.factory

import com.sample.clean.data.model.UserEntity
import com.sample.clean.domain.model.User

fun createUserEntity() = UserEntity(
    "1",
    "Quan",
    "quan00",
    "quan00@gmail.com",
    "0987654321",
    "Tu Liem - Ha Noi"
)

fun createUser() = User(
    "2",
    "Minh",
    "Minh11",
    "minh11@framgia.com",
    "0123456789",
    "Ha Dong - Ha Noi"
)