package com.ysfcyln.feature_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ysfcyln.base.DatabaseService
import com.ysfcyln.base.NetworkService
import com.ysfcyln.feature_one.di.FeatureOneComponentProvider
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var featureOneObject: FeatureOneObject

    /**
     * Create component and inject
     */
    private fun inject() {
        // When rotation happens component and its dependencies recreated :(
        val featureOneComponent = (application as FeatureOneComponentProvider).provideFeatureOneComponent()
        featureOneComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
        Log.d("FeatureOneActivity", databaseService.toString())
        Log.d("FeatureOneActivity", networkService.toString())
        Log.d("FeatureOneActivity", featureOneObject.toString())
    }
}
