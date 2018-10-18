package com.sample.clean.data.local.pref

import android.content.Context
import com.google.gson.Gson

class AppPrefs constructor(
    mContext: Context, val gson: Gson
) : PrefHelper {

    private var sharedPreferences = mContext.getSharedPreferences(mContext.packageName, Context.MODE_PRIVATE)

    companion object {
        private const val FIRST_RUN = "first_run"
    }

    override fun clear() {
        sharedPreferences.edit().clear().apply()
    }

}