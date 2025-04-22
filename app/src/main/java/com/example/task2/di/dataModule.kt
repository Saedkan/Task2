package com.example.task2.di

import com.example.task2.domain.repository.UserRepository
import com.example.task2.data.repository.UserRepositoryImpl
import com.example.task2.data.source.LocalDataSource
import com.example.task2.data.source.LocalDataSourceImpl
import com.example.task2.data.source.RemoteDataSource
import com.example.task2.data.source.RemoteDataSourceImpl
import org.koin.dsl.module

val dataModule = module {
    single<UserRepository> { UserRepositoryImpl(get(), get()) }
    single<RemoteDataSource> { RemoteDataSourceImpl(get()) }
    single<LocalDataSource> { LocalDataSourceImpl(get()) }
}
