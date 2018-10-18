package com.sample.clean.data

import com.sample.clean.data.local.db.AppDatabase
import com.sample.clean.data.local.pref.PrefHelper
import com.sample.clean.data.model.UserEntityMapper
import com.sample.clean.data.remote.api.UserApi
import com.sample.clean.domain.model.User
import com.sample.clean.domain.repository.UserRepository
import io.reactivex.Single

class UserRepositoryImpl constructor(
    private val userApi: UserApi,
    private val appDatabase: AppDatabase,
    private val prefHelper: PrefHelper,
    private val userMapper: UserEntityMapper
) : UserRepository {

    override fun getUser(id: String, fromServer: Boolean): Single<User> {
        return Single.just(User(id))
    }

}
