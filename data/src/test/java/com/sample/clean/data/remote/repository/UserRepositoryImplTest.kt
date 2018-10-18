package com.sample.clean.data.remote.repository

import android.content.res.Resources
import com.sample.clean.data.UserRepositoryImpl
import com.sample.clean.data.local.db.AppDatabase
import com.sample.clean.data.local.pref.PrefHelper
import com.sample.clean.data.model.UserEntityMapper
import com.sample.clean.data.remote.api.UserApi
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class UserRepositoryImplTest {

    lateinit var userRepositoryImpl: UserRepositoryImpl

    private val resources = mock(Resources::class.java)
    private val userApiMock = mock(UserApi::class.java)
    private val appDatabaseMock = mock(AppDatabase::class.java)
    private val prefHelperMock = mock(PrefHelper::class.java)
    private val userEntityMapper = UserEntityMapper()

    @Before
    fun setup() {
        userRepositoryImpl = UserRepositoryImpl(
            userApi = userApiMock,
            appDatabase = appDatabaseMock,
            prefHelper = prefHelperMock,
            userMapper = userEntityMapper
        )
    }

    @Test
    fun getUserTest() {

    }

}