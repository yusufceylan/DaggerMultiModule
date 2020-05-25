package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.feature_one.di.FeatureOneComponent
import com.ysfcyln.feature_two.di.FeatureTwoComponent
import dagger.Module

/**
 * Associate SubComponents with AppComponent
 */
@Module(
    subcomponents = [
        MainComponent::class,
        FeatureOneComponent::class,
        FeatureTwoComponent::class
    ]
)
class SubComponentsModule {
}