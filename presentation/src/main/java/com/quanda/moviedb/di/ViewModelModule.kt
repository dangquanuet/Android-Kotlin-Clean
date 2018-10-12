package com.quanda.moviedb.di

import com.quanda.moviedb.ui.screen.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module(override = true) {
    viewModel { MainActivityViewModel() }
}