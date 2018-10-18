package com.sample.clean.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sample.clean.data.local.db.dao.UserDao
import com.sample.clean.data.model.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

}