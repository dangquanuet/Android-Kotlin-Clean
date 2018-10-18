package com.sample.clean.data.remote.api.base

import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import java.io.IOException

abstract class BaseApiTest {

    lateinit var mockWebServer: MockWebServer

    @Before
    open fun setup() {
        mockWebServer = MockWebServer()
    }

    @After
    @Throws(IOException::class)
    fun stopService() {
        mockWebServer.shutdown()
    }
}