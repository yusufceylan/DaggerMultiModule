package com.ysfcyln.daggermultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ysfcyln.base.DatabaseService
import com.ysfcyln.base.NetworkService
import com.ysfcyln.daggermultimodule.R
import com.ysfcyln.daggermultimodule.di.main.MainComponentProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    /**
     * Create component and inject
     */
    private fun inject() {
        // When rotation happens component and its dependencies recreated :(
        val mainComponent = (application as MainComponentProvider).provideMainComponent()
        mainComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", databaseService.toString())
        Log.d("MainActivity", networkService.toString())
    }
}
