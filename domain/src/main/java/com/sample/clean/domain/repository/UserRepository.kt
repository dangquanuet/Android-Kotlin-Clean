package com.sample.clean.domain.repository

import com.sample.clean.domain.model.User
import com.sample.clean.domain.repository.base.Repository
import io.reactivex.Single

interface UserRepository : Repository {

    fun getUser(id: String, fromServer: Boolean): Single<User>

}