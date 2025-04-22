package com.example.task2.di

import androidx.room.Room
import com.example.task2.data.database.AppDatabase
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "app-db").build()
    }

    single { get<AppDatabase>().userDao() }
}
