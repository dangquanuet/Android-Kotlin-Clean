package com.sample.clean.di

import com.sample.clean.model.UserItemMapper
import org.koin.dsl.module.module

val itemMapperModule = module(override = true) {
    single { UserItemMapper() }
}