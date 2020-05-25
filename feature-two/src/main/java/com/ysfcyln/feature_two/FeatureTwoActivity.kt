package com.ysfcyln.feature_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ysfcyln.base.DatabaseService
import com.ysfcyln.base.NetworkService
import com.ysfcyln.feature_two.di.FeatureTwoComponentProvider
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    /**
     * Create component and inject
     */
    private fun inject() {
        // When rotation happens component and its dependencies recreated :(
        val featureTwoComponent = (application as FeatureTwoComponentProvider).provideFeatureTwoComponent()
        featureTwoComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)
        Log.d("FeatureTwoActivity", databaseService.toString())
        Log.d("FeatureTwoActivity", networkService.toString())
    }
}
