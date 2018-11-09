package com.sample.clean.data.di

import com.sample.clean.data.model.UserEntityMapper
import org.koin.dsl.module.module
import org.koin.experimental.builder.single

val entityMapperModule = module {
    single<UserEntityMapper>()
}