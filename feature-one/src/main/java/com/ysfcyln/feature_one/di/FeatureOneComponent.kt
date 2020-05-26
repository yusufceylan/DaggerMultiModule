package com.ysfcyln.feature_one.di

import com.ysfcyln.base.ActivityScope
import com.ysfcyln.feature_one.FeatureOneActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        // Bounded feature one activity necessary modules comes here
        FeatureOneModule::class
    ]
)
interface FeatureOneComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : FeatureOneComponent
    }

    fun inject(featureOneActivity: FeatureOneActivity) // Add feature one activity to Dagger graph

}