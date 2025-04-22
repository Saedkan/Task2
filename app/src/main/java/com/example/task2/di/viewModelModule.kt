package com.example.task2.di

import com.example.task2.presentation.UserViewModel
import org.koin.androidx.compose.viewModel
import org.koin.dsl.module
import org.koin.androidx.compose.get


// di/ViewModelModule.kt
val viewModelModule = module {
    viewModel { UserViewModel(get()) }
}
