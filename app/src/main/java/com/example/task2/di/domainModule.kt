package com.example.task2.di

import org.koin.dsl.module
import com.example.task2.domain.usecase.GetUserUseCase
import com.example.task2.domain.usecase.SaveUserUseCase

val domainModule = module {
    factory { GetUserUseCase(get()) }
    factory { SaveUserUseCase(get()) }
}
