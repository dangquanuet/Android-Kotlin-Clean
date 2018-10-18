package com.sample.clean.di

import android.content.res.Resources
import com.sample.clean.MainApplication
import org.koin.dsl.module.module

val appModule = module(override = true) {
    single { createResources(get()) }
}

fun createResources(application: MainApplication): Resources = application.resources
