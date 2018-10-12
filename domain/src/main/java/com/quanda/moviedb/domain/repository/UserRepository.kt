package com.quanda.moviedb.domain.repository

import com.quanda.moviedb.domain.model.User
import com.quanda.moviedb.domain.repository.base.Repository
import io.reactivex.Single

interface UserRepository : Repository {

    fun getUser(id: String, fromServer: Boolean): Single<User>

}