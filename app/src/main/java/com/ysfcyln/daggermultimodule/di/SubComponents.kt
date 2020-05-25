package com.ysfcyln.daggermultimodule.di

import com.ysfcyln.daggermultimodule.di.main.MainComponent
import com.ysfcyln.daggermultimodule.di.main.MainComponentProvider

interface SubComponents: MainComponentProvider {

    override fun provideMainComponent(): MainComponent {
        return DiProvider.appComponent().mainComponent().create()
    }
}