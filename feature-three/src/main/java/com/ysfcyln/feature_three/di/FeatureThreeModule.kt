package com.ysfcyln.feature_three.di

import com.ysfcyln.feature_three.FeatureThreeObject
import dagger.Module
import dagger.Provides

@Module
class FeatureThreeModule {

    @Provides
    fun provideFeatureThreeObject() = FeatureThreeObject()

}