package com.sample.clean.ui.screen.webview

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.sample.clean.R
import com.sample.clean.databinding.FragmentWebViewBinding
import com.sample.clean.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_web_view.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class WebViewFragment : BaseFragment<FragmentWebViewBinding, WebViewViewModel>() {

    companion object {
        const val TAG = "WebViewFragment"
        const val TITLE = "TITLE"
        const val URL = "URL"

        fun newInstance(title: String, url: String) =
            WebViewFragment().apply {
                arguments = Bundle().apply {
                    putString(TITLE, title)
                    putString(URL, url)
                }
            }
    }

    override val layoutId: Int
        get() = R.layout.fragment_web_view

    override val viewModel by viewModel<WebViewViewModel>()

    @SuppressLint("SetJavaScriptEnabled")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            title.value = arguments?.getString(TITLE)
            url.value = arguments?.getString(URL)
        }
        image_back.setOnClickListener {
            onBack()
        }
        web_view.apply {
            settings.apply {
                javaScriptEnabled = true
                builtInZoomControls = true
                loadWithOverviewMode = true
                useWideViewPort = true
            }
            webViewClient = object : WebViewClient() {
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    try {
                        viewModel.isLoading.value = true
                    } catch (e: IllegalStateException) {

                    }
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    try {
                        viewModel.isLoading.value = false
                        // if param title is null or blank, use web title
                        if (viewModel.title.value.isNullOrBlank() && view?.title != null && view.title.isNotBlank()) {
                            viewModel.title.value = view.title
                        }
                    } catch (e: IllegalStateException) {

                    }
                }
            }
        }
    }

    override fun handleShowLoading(isLoading: Boolean) {
        // using progress bar
    }

    fun webViewCanBack(): Boolean {
        return web_view.canGoBack()
    }

    fun webViewBack() {
        if (web_view.canGoBack()) {
            web_view.goBack()
        }
    }

    override fun onBack(): Boolean {
        if (web_view.canGoBack()) {
            web_view.goBack()
            return true
        } else {
            activity?.onBackPressed()
            return false
        }
    }
}