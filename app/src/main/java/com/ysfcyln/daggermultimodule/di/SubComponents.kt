package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.daggermultimodule.di.main.MainComponentProvider
import com.ysfcyln.feature_one.di.FeatureOneComponent
import com.ysfcyln.feature_one.di.FeatureOneComponentProvider
import com.ysfcyln.feature_three.di.FeatureThreeComponent
import com.ysfcyln.feature_three.di.FeatureThreeComponentProvider
import com.ysfcyln.feature_two.di.FeatureTwoComponent
import com.ysfcyln.feature_two.di.FeatureTwoComponentProvider

interface SubComponents: MainComponentProvider, FeatureOneComponentProvider, FeatureTwoComponentProvider,
FeatureThreeComponentProvider {

    override fun provideMainComponent(): MainComponent {
        return DiProvider.appComponent().mainComponent().create()
    }

    override fun provideFeatureOneComponent(): FeatureOneComponent {
        return DiProvider.appComponent().featureOneComponent().create()
    }

    override fun provideFeatureTwoComponent(): FeatureTwoComponent {
        return DiProvider.appComponent().featureTwoComponent().create()
    }

    override fun provideFeatureThreeComponent(): FeatureThreeComponent {
        return DiProvider.appComponent().featureThreeComponent().create()
    }
}