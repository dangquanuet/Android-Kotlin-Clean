package com.sample.clean.data.di

import com.sample.clean.data.model.UserEntityMapper
import org.koin.dsl.module.module

val entityMapperModule = module(override = true) {
    single { UserEntityMapper() }
}