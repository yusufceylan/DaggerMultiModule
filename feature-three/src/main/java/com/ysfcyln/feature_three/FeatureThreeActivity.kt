package com.ysfcyln.feature_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ysfcyln.base.DatabaseService
import com.ysfcyln.base.NetworkService
import com.ysfcyln.feature_three.di.FeatureThreeComponentProvider
import javax.inject.Inject

class FeatureThreeActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var featureThreeObject: FeatureThreeObject

    /**
     * Create component and inject
     */
    private fun inject() {
        // When rotation happens component and its dependencies recreated :(
        val featureThreeComponent = (application as FeatureThreeComponentProvider).provideFeatureThreeComponent()
        featureThreeComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_three)
        Log.d("FeatureThreeActivity", databaseService.toString())
        Log.d("FeatureThreeActivity", networkService.toString())
        Log.d("FeatureThreeActivity", featureThreeObject.toString())
    }
}
