package com.ysfcyln.feature_two.di

import com.ysfcyln.feature_three.di.FeatureThreeModule
import com.ysfcyln.feature_two.FeatureTwoObject
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        FeatureThreeModule::class
    ]
)
class FeatureTwoModule {

    @Provides
    fun provideFeatureTwoObject() = FeatureTwoObject()

}