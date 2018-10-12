package com.quanda.moviedb

import android.app.Application
import com.quanda.moviedb.data.di.entityMapperModule
import com.quanda.moviedb.data.di.networkModule
import com.quanda.moviedb.data.di.repositoryModule
import com.quanda.moviedb.di.appModule
import com.quanda.moviedb.di.itemMapperModule
import com.quanda.moviedb.di.viewModelModule
import com.quanda.moviedb.domain.di.useCaseModule
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