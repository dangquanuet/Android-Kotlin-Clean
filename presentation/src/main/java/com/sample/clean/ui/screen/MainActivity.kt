package com.sample.clean.ui.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sample.clean.R
import com.sample.clean.ui.screen.splash.SplashFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SplashFragment.newInstance(), SplashFragment.TAG)
                .commit()
        }
    }
}
