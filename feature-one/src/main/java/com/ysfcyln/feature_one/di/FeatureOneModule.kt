package com.ysfcyln.feature_one.di

import com.ysfcyln.feature_one.FeatureOneObject
import dagger.Module
import dagger.Provides

@Module
class FeatureOneModule {

    @Provides
    fun provideFeatureOneObject() = FeatureOneObject()

}