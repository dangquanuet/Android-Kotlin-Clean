package com.sample.clean.ui.screen.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.sample.clean.R
import com.sample.clean.databinding.FragmentMainBinding
import com.sample.clean.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {

    companion object {
        const val TAG = "MainFragment"

        fun newInstance() = MainFragment()
    }

    override val layoutId: Int
        get() = R.layout.fragment_main

    override val viewModel by viewModel<MainViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.user.observe(this, Observer {
            tv_user.text = it.id
        })

        viewModel.start()
    }

}