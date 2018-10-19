package com.sample.clean.di

import android.content.res.Resources
import com.sample.clean.MainApplication
import com.sample.clean.data.di.entityMapperModule
import com.sample.clean.data.di.networkModule
import com.sample.clean.data.di.repositoryModule
import com.sample.clean.domain.di.useCaseModule
import com.sample.clean.rx.AppSchedulerProvider
import com.sample.clean.rx.SchedulerProvider
import org.koin.dsl.module.module

val appModule = module(override = true) {
    single { createResources(get()) }
    single<SchedulerProvider> { AppSchedulerProvider() }
}

fun createResources(application: MainApplication): Resources = application.resources

val modules = listOf(
    entityMapperModule,
    networkModule,
    repositoryModule,
    useCaseModule,
    appModule,
    itemMapperModule,
    viewModelModule
)