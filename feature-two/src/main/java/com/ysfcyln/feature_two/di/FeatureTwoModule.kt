package com.ysfcyln.feature_two.di

import com.ysfcyln.feature_two.FeatureTwoObject
import dagger.Module
import dagger.Provides

@Module
class FeatureTwoModule {

    @Provides
    fun provideFeatureTwoObject() = FeatureTwoObject()

}