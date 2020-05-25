package com.ysfcyln.feature_two.di

import com.ysfcyln.feature_two.FeatureTwoActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        // Bounded feature two activity necessary modules comes here
    ]
)
interface FeatureTwoComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : FeatureTwoComponent
    }

    fun inject(featureTwoActivity: FeatureTwoActivity) // Add feature two activity to Dagger graph

}