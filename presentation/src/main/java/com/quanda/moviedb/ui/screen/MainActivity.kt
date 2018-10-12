package com.quanda.moviedb.ui.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quanda.moviedb.R
import com.quanda.moviedb.ui.screen.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
                .replace(R.id.parent, MainFragment.newInstance(), MainFragment.TAG)
                .commit()
    }
}
