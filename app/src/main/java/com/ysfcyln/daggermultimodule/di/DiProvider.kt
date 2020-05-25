package com.ysfcyln.daggermultimodule.di

import android.app.Application

object DiProvider {
    private lateinit var appComponent: AppComponent

    @JvmStatic
    fun appComponent() = appComponent

    fun buildDi(application: Application) {
        appComponent = DaggerAppComponent.factory().create(application)
    }
}