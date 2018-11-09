package com.sample.clean.di

import com.sample.clean.ui.screen.MainActivityViewModel
import com.sample.clean.ui.screen.main.MainViewModel
import com.sample.clean.ui.screen.splash.SplashViewModel
import org.koin.androidx.viewmodel.experimental.builder.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel<MainActivityViewModel>()
    viewModel<MainViewModel>()
    viewModel<SplashViewModel>()
}