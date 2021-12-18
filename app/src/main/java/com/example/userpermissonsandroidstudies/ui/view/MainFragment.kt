package com.example.userpermissonsandroidstudies.ui.view

import androidx.fragment.app.Fragment
import com.example.userpermissonsandroidstudies.R
import com.example.userpermissonsandroidstudies.ui.viewModel.MainViewModel

class MainFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

}