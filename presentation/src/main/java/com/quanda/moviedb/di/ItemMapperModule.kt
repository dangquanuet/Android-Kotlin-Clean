package com.quanda.moviedb.di

import com.quanda.moviedb.model.UserItemMapper
import org.koin.dsl.module.module

val itemMapperModule = module(override = true) {
    single { UserItemMapper() }
}