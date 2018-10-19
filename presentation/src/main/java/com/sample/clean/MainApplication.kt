package com.sample.clean

import android.app.Application
import com.sample.clean.di.modules
import org.koin.android.ext.android.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, modules)
    }

}