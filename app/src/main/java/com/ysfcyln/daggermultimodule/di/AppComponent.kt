package com.ysfcyln.daggermultimodule.di

import android.app.Application
import com.ysfcyln.base.BaseModule
import com.ysfcyln.daggermultimodule.di.main.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        BaseModule::class,
        SubComponentsModule::class
    ]
)
interface AppComponent {

    /**
     * A {@see [Component.Factory]} that initializes necessary implementations
     */
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

    // Save the reference of factories in the app component for creating sub components
    fun mainComponent() : MainComponent.Factory

}