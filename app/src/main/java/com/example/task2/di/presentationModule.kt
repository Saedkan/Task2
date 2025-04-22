package com.example.task2.di

import com.example.task2.presentation.UserViewModel
import org.koin.dsl.module

import org.koin.androidx.compose.viewModel
import org.koin.core.context.GlobalContext.get

val presentationModule = module {
    viewModel { UserViewModel(get(), get()) }
}
