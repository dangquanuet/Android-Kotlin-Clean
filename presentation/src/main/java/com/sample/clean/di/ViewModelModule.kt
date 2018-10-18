package com.sample.clean.di

import com.sample.clean.ui.screen.MainActivityViewModel
import com.sample.clean.ui.screen.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module(override = true) {
    viewModel { MainActivityViewModel() }
    viewModel { MainViewModel() }
}