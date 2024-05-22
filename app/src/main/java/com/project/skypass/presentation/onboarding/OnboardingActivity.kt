package com.project.skypass.presentation.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.skypass.databinding.ActivityOnboardingBinding
import com.project.skypass.presentation.main.MainActivity

class OnboardingActivity : AppCompatActivity() {

    private val binding: ActivityOnboardingBinding by lazy {
        ActivityOnboardingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //slidePage()
    }

    /*private fun slidePage() {
        pageOne()
        pageTwo()
        pageThree()
    }

    private fun pageThree() {
        AppIntroCustomLayoutFragment.newInstance(
            R.layout.layout_onboarding_three,
        )
    }

    private fun pageTwo() {
        AppIntroCustomLayoutFragment.newInstance(
            R.layout.layout_onboarding_two,
        )
    }

    private fun pageOne() {
        addSlide(
            AppIntroCustomLayoutFragment.newInstance(
                R.layout.layout_onboarding_one,
            ),
        )
    }*/

    private fun navigateToMain() {
        startActivity(
            Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            },
        )
    }


}