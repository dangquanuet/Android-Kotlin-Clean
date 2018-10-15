package com.quanda.moviedb.data.remote.repository

import android.content.res.Resources
import com.quanda.moviedb.data.UserRepositoryImpl
import com.quanda.moviedb.data.local.db.AppDatabase
import com.quanda.moviedb.data.local.pref.PrefHelper
import com.quanda.moviedb.data.model.UserEntityMapper
import com.quanda.moviedb.data.remote.api.UserApi
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