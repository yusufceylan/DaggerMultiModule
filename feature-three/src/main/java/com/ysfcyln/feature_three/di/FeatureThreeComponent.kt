package com.ysfcyln.feature_three.di

import com.ysfcyln.feature_three.FeatureThreeActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        // Bounded feature three activity necessary modules comes here
        FeatureThreeModule::class
    ]
)
interface FeatureThreeComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : FeatureThreeComponent
    }

    fun inject(featureThreeActivity: FeatureThreeActivity) // Add feature three activity to Dagger graph

}