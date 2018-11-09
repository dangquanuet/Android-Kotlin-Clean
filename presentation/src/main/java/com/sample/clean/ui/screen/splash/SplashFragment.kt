package com.sample.clean.ui.screen.splash

import android.os.Handler
import com.sample.clean.R
import com.sample.clean.databinding.FragmentSplashBinding
import com.sample.clean.ui.base.BaseFragment
import com.sample.clean.ui.screen.main.MainFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {

    companion object {
        const val TAG = "SplashFragment"
        const val DELAY_MILLISECONDS = 1000L

        fun newInstance() = SplashFragment()
    }

    override val layoutId: Int
        get() = R.layout.fragment_splash

    override val viewModel by viewModel<SplashViewModel>()

    private val handler = Handler()

    private val task = Runnable {
        replaceFragment(
            fragment = MainFragment.newInstance(),
            TAG = MainFragment.TAG
        )
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(task, DELAY_MILLISECONDS)
    }

    override fun onPause() {
        handler.removeCallbacks(task)
        super.onPause()
    }
}