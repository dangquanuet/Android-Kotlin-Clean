package com.quanda.moviedb.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.quanda.moviedb.data.local.db.dao.UserDao
import com.quanda.moviedb.data.model.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}