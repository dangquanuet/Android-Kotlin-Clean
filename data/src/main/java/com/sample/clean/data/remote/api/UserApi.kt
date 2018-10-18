package com.sample.clean.data.remote.api

import com.sample.clean.data.model.UserEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("users/")
    fun getUsers(): Single<List<UserEntity>>

    @GET("users/{id}")
    fun getUser(@Path("id") userId: String): Single<UserEntity>

}