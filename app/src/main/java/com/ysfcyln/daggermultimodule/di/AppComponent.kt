package com.ysfcyln.daggermultimodule.di

import android.app.Application
import com.ysfcyln.base.BaseModule
import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.feature_one.di.FeatureOneComponent
import com.ysfcyln.feature_three.di.FeatureThreeComponent
import com.ysfcyln.feature_two.di.FeatureTwoComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        BaseModule::class,
        SubComponentsModule::class
    ]
)
interface AppComponent {

    /**
     * A {@see [Component.Factory]} that initializes necessary implementations
     */
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

    // Save the reference of factories in the app component for creating sub components
    fun mainComponent() : MainComponent.Factory

    // Save the reference of factories in the app component for creating sub components
    fun featureOneComponent() : FeatureOneComponent.Factory

    // Save the reference of factories in the app component for creating sub components
    fun featureTwoComponent() : FeatureTwoComponent.Factory

    // Save the reference of factories in the app component for creating sub components
    fun featureThreeComponent() : FeatureThreeComponent.Factory

}