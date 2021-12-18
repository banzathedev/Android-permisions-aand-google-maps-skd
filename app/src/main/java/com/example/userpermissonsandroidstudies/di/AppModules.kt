package com.example.userpermissonsandroidstudies.di

import org.koin.dsl.module

val viewModel = module {}
val repository = module {}
val useCases = module {}
val services = module {}


val aplicationModules = listOf(viewModel, repository, useCases, services)
