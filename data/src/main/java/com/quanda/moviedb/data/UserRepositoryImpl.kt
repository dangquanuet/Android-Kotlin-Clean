package com.quanda.moviedb.data

import com.quanda.moviedb.data.local.db.AppDatabase
import com.quanda.moviedb.data.local.pref.PrefHelper
import com.quanda.moviedb.data.model.UserEntityMapper
import com.quanda.moviedb.data.remote.api.UserApi
import com.quanda.moviedb.domain.model.User
import com.quanda.moviedb.domain.repository.UserRepository
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
