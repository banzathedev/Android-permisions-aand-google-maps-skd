package com.example.userpermissonsandroidstudies.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userpermissonsandroidstudies.R
import com.example.userpermissonsandroidstudies.utils.replaceView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        replaceView(SplashFragment())
    }
}