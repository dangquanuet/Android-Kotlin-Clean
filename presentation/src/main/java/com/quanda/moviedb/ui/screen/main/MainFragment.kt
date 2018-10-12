package com.quanda.moviedb.ui.screen.main

import android.os.Bundle
import com.quanda.moviedb.BR
import com.quanda.moviedb.R
import com.quanda.moviedb.databinding.FragmentMainBinding
import com.quanda.moviedb.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {

    companion object {
        const val TAG = "MainFragment"

        fun newInstance() = MainFragment()
    }

    override val bindingVariable: Int
        get() = BR.viewModel

    override val layoutId: Int
        get() = R.layout.fragment_main

    override val viewModel by viewModel<MainViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewBinding.viewModel = viewModel
    }

}