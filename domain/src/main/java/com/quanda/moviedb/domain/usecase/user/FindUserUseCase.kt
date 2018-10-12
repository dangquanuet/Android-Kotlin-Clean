package com.quanda.moviedb.domain.usecase.user

import com.quanda.moviedb.domain.model.User
import com.quanda.moviedb.domain.repository.UserRepository
import com.quanda.moviedb.domain.usecase.UseCase
import io.reactivex.Single

open class FindUserUseCase constructor(
        private val userRepository: UserRepository
) : UseCase<FindUserUseCase.Params?, Single<User>>() {

    override fun onCleared() {
        // if Y want subscribe in UseCase
        // Please unSubscribe it
    }

    override fun createObservable(params: Params?): Single<User> {
        return userRepository.getUser(params!!.userId, params.fromServer)
    }

    data class Params(val userId: String, val fromServer: Boolean)

}