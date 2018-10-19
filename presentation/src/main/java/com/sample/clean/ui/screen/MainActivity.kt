package com.sample.clean.ui.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sample.clean.R
import com.sample.clean.ui.screen.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance(), MainFragment.TAG)
                    .commit()
        }
    }
}
