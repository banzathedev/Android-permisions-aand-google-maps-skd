package com.example.userpermissonsandroidstudies.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.userpermissonsandroidstudies.R
import com.example.userpermissonsandroidstudies.ui.viewModel.OnboardingViewModel
import org.koin.android.ext.android.inject

class OnboardingFragment : Fragment(R.layout.onboarding_fragment) {

    companion object {
        fun newInstance() = OnboardingFragment()
    }

    private val viewModel: OnboardingViewModel by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}