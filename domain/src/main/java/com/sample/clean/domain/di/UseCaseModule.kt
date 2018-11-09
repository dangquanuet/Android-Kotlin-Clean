package com.sample.clean.domain.di

import com.sample.clean.domain.usecase.user.FindUserUseCase
import org.koin.dsl.module.module
import org.koin.experimental.builder.single

val useCaseModule = module {
    single<FindUserUseCase>()
}