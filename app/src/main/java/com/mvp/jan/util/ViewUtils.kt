package com.mvp.jan.util

import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

fun ViewGroup.inflate(layoutId: Int): View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}

fun AppCompatActivity.toastShort(message: String) {
    Toast.makeText(this, message ,Toast.LENGTH_SHORT).show()
}