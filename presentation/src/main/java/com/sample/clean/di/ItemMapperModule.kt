package com.sample.clean.di

import com.sample.clean.model.UserItemMapper
import org.koin.dsl.module.module
import org.koin.experimental.builder.single

val itemMapperModule = module {
    single<UserItemMapper>()
}