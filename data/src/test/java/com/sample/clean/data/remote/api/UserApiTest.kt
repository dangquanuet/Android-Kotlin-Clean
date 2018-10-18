package com.sample.clean.data.remote.api

import com.sample.clean.data.remote.api.base.BaseApiTest
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(JUnit4::class)
class UserApiTest : BaseApiTest() {

    lateinit var service: UserApi

    @Before
    override fun setup() {
        super.setup()
        service = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create<UserApi>(UserApi::class.java)
    }


}