package com.quanda.moviedb.data.remote.mock

import com.quanda.moviedb.data.model.UserEntity
import com.quanda.moviedb.data.remote.api.UserApi
import io.reactivex.Single

class MockUserApi constructor() : UserApi {

    override fun getUsers(): Single<List<UserEntity>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUser(userId: String): Single<UserEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}