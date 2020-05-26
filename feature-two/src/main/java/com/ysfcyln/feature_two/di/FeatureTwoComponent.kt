package com.ysfcyln.feature_two.di

import com.ysfcyln.base.ActivityScope
import com.ysfcyln.feature_two.FeatureTwoActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        // Bounded feature two activity necessary modules comes here
        FeatureTwoModule::class
    ]
)
interface FeatureTwoComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : FeatureTwoComponent
    }

    fun inject(featureTwoActivity: FeatureTwoActivity) // Add feature two activity to Dagger graph

}