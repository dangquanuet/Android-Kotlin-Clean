package com.sample.clean.ui.screen.webview

import androidx.lifecycle.MutableLiveData
import com.sample.clean.ui.base.BaseViewModel

class WebViewViewModel : BaseViewModel() {

    val title = MutableLiveData<String>()
    val url = MutableLiveData<String>()

}