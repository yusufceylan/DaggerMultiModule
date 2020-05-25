package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import dagger.Module

/**
 * Associate SubComponents with AppComponent
 */
@Module(
    subcomponents = [
        MainComponent::class
    ]
)
class SubComponentsModule {
}