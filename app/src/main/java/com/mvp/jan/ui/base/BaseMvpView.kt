package com.mvp.jan.ui.base

import android.content.Context
import android.support.annotation.StringRes

interface BaseMvpView {

    fun getContext(): Context

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

}