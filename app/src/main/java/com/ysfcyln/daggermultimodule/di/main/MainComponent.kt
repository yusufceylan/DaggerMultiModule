package com.ysfcyln.daggermultimodule.di.main

import com.ysfcyln.daggermultimodule.MainActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        // Bounded main activity necessary modules comes here
    ]
)
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create() : MainComponent
    }

    fun inject(mainActivity: MainActivity) // Add main activity to Dagger graph

}