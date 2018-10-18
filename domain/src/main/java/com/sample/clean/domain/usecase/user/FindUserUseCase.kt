package com.sample.clean.domain.usecase.user

import com.sample.clean.domain.Constants
import com.sample.clean.domain.model.User
import com.sample.clean.domain.repository.UserRepository
import com.sample.clean.domain.usecase.UseCase
import io.reactivex.Single

open class FindUserUseCase constructor(
        private val userRepository: UserRepository
) : UseCase<FindUserUseCase.Params?, Single<User>>() {

    override fun onCleared() {
        // if Y want subscribe in UseCase
        // Please unSubscribe it
    }

    override fun createObservable(params: Params?): Single<User> {
        params?.apply {
            return userRepository.getUser(params.userId, params.fromServer)
        }
        return Single.error { Throwable(Constants.PARAMS_ERROR) }
    }

    data class Params(val userId: String, val fromServer: Boolean)

}