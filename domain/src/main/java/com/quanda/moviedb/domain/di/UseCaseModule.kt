package com.quanda.moviedb.domain.di

import com.quanda.moviedb.domain.usecase.user.FindUserUseCase
import org.koin.dsl.module.module

val useCaseModule = module(override = true) {
    single { FindUserUseCase(get()) }
}