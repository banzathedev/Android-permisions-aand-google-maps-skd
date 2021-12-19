package com.example.userpermissonsandroidstudies.ui.view

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.View
import com.example.userpermissonsandroidstudies.R
import com.example.userpermissonsandroidstudies.utils.SPLASH_DELAY
import com.example.userpermissonsandroidstudies.utils.replaceView


class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed({
            startOnboarding()
        }, SPLASH_DELAY.toLong())
    }

    private fun startOnboarding() {
        requireActivity().replaceView(OnboardingFragment())
    }
}