package com.sample.clean.di

import com.sample.clean.data.di.entityMapperModule
import com.sample.clean.data.di.networkModule
import com.sample.clean.data.di.repositoryModule
import com.sample.clean.domain.di.useCaseModule
import com.sample.clean.rx.AppSchedulerProvider
import com.sample.clean.rx.SchedulerProvider
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

val appModule = module {
    single { androidApplication().resources }
    single<SchedulerProvider> { AppSchedulerProvider() }
}

val modules = listOf(
    entityMapperModule,
    networkModule,
    repositoryModule,
    useCaseModule,
    appModule,
    itemMapperModule,
    viewModelModule
)