package com.quanda.moviedb.data.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.quanda.moviedb.data.Constants
import com.quanda.moviedb.data.UserRepositoryImpl
import com.quanda.moviedb.data.local.db.AppDatabase
import com.quanda.moviedb.data.local.pref.AppPrefs
import com.quanda.moviedb.data.local.pref.PrefHelper
import com.quanda.moviedb.domain.repository.UserRepository
import org.koin.dsl.module.module

val repositoryModule = module(override = true) {
    single { createDatabaseName() }
    single { createAppDatabase(get(), get()) }
    single { createUserDao(get()) }
    single<PrefHelper> { AppPrefs(get(), get()) }
    single { Gson() }
    single<UserRepository> { UserRepositoryImpl(get(), get(), get(), get()) }
}


fun createDatabaseName() = Constants.DATABASE_NAME

fun createAppDatabase(dbName: String, context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()

fun createUserDao(appDatabase: AppDatabase) = appDatabase.userDao()
