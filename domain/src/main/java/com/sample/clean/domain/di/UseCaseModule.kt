package com.sample.clean.domain.di

import com.sample.clean.domain.usecase.user.FindUserUseCase
import org.koin.dsl.module.module

val useCaseModule = module(override = true) {
    single { FindUserUseCase(get()) }
}