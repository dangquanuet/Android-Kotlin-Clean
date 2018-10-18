package com.sample.clean

import android.app.Application
import com.sample.clean.data.di.entityMapperModule
import com.sample.clean.data.di.networkModule
import com.sample.clean.data.di.repositoryModule
import com.sample.clean.di.appModule
import com.sample.clean.di.itemMapperModule
import com.sample.clean.di.viewModelModule
import com.sample.clean.domain.di.useCaseModule
import org.koin.android.ext.android.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
                entityMapperModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                appModule,
                itemMapperModule,
                viewModelModule
        ))
    }

}