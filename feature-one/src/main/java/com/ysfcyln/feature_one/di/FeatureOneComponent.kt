package com.ysfcyln.feature_one.di

import com.ysfcyln.feature_one.FeatureOneActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        // Bounded feature one activity necessary modules comes here
    ]
)
interface FeatureOneComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : FeatureOneComponent
    }

    fun inject(featureOneActivity: FeatureOneActivity) // Add feature one activity to Dagger graph

}