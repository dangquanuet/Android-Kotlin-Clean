package com.quanda.moviedb.data.model.factory

import com.quanda.moviedb.data.model.UserEntity
import com.quanda.moviedb.domain.model.User

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