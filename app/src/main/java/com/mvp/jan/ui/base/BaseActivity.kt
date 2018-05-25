package com.mvp.jan.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
    }

    protected abstract fun getLayoutResource(): Int

    protected abstract fun displayHomeAsUp(): Boolean

}