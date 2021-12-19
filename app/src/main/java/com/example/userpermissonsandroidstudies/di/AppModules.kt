package com.example.userpermissonsandroidstudies.di

import com.example.userpermissonsandroidstudies.ui.viewModel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModel = module {
    viewModel { MainViewModel() }
}
val repository = module {}
val useCases = module {}
val services = module {}


val aplicationModules = listOf(viewModel, repository, useCases, services)
