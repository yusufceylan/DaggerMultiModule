package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.daggermultimodule.di.main.MainComponentProvider
import com.ysfcyln.feature_one.di.FeatureOneComponent
import com.ysfcyln.feature_one.di.FeatureOneComponentProvider
import com.ysfcyln.feature_two.di.FeatureTwoComponent
import com.ysfcyln.feature_two.di.FeatureTwoComponentProvider

interface SubComponents: MainComponentProvider, FeatureOneComponentProvider, FeatureTwoComponentProvider {

    override fun provideMainComponent(): MainComponent {
        return DiProvider.appComponent().mainComponent().create()
    }

    override fun provideFeatureOneComponent(): FeatureOneComponent {
        return DiProvider.appComponent().featureOneComponent().create()
    }

    override fun provideFeatureTwoComponent(): FeatureTwoComponent {
        return DiProvider.appComponent().featureTwoComponent().create()
    }
}