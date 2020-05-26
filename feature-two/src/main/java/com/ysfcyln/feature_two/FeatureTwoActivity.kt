package com.ysfcyln.feature_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ysfcyln.base.DatabaseService
import com.ysfcyln.base.NetworkService
import com.ysfcyln.feature_three.FeatureThreeActivity
import com.ysfcyln.feature_three.FeatureThreeObject
import com.ysfcyln.feature_two.di.FeatureTwoComponentProvider
import kotlinx.android.synthetic.main.activity_feature_two.*
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var featureTwoObject: FeatureTwoObject

    @Inject
    lateinit var featureThreeObject: FeatureThreeObject // Shared dependency

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
        Log.d("FeatureTwoActivity", featureTwoObject.toString())
        Log.d("FeatureTwoActivity", featureThreeObject.toString())

        clickListeners()
    }

    /**
     * View click listeners
     */
    private fun clickListeners() {
        btnFeatureThree.setOnClickListener {
            startActivity(Intent(this, FeatureThreeActivity::class.java))
        }
    }
}
