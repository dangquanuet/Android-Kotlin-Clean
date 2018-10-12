package com.quanda.moviedb.data.di

import com.quanda.moviedb.data.model.UserEntityMapper
import org.koin.dsl.module.module

val entityMapperModule = module(override = true) {
    single { UserEntityMapper() }
}