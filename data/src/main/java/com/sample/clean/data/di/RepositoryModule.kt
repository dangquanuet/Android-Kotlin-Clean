package com.sample.clean.data.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.sample.clean.data.Constants
import com.sample.clean.data.UserRepositoryImpl
import com.sample.clean.data.local.db.AppDatabase
import com.sample.clean.data.local.pref.AppPrefs
import com.sample.clean.data.local.pref.PrefHelper
import com.sample.clean.domain.repository.UserRepository
import org.koin.dsl.module.module
import org.koin.experimental.builder.create

val repositoryModule = module {
    single { createDatabaseName() }
    single { createAppDatabase(get(), get()) }
    single { createUserDao(get()) }
    single<PrefHelper> { create<AppPrefs>() }
    single { Gson() }
    single<UserRepository> { create<UserRepositoryImpl>() }
}


fun createDatabaseName() = Constants.DATABASE_NAME

fun createAppDatabase(dbName: String, context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()

fun createUserDao(appDatabase: AppDatabase) = appDatabase.userDao()
