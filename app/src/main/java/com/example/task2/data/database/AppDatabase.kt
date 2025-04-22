package com.example.task2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.task2.data.model.UserEntity
import com.example.task2.data.dao.UserDao

@Database(
    entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
