package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.daggermultimodule.di.main.MainComponentProvider
import com.ysfcyln.feature_one.di.FeatureOneComponent
import com.ysfcyln.feature_one.di.FeatureOneComponentProvider

interface SubComponents: MainComponentProvider, FeatureOneComponentProvider {

    override fun provideMainComponent(): MainComponent {
        return DiProvider.appComponent().mainComponent().create()
    }

    override fun provideFeatureOneComponent(): FeatureOneComponent {
        return DiProvider.appComponent().featureOneComponent().create()
    }
}