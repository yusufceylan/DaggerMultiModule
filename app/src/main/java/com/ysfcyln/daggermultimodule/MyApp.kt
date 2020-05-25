package com.ysfcyln.daggermultimodule

import android.app.Application
import com.ysfcyln.daggermultimodule.di.DiProvider
import com.ysfcyln.daggermultimodule.di.SubComponents

class MyApp : Application(), SubComponents {

    override fun onCreate() {
        super.onCreate()
        DiProvider.buildDi(this)
    }

}