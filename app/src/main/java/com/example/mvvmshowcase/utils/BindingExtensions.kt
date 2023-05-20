package com.example.mvvmshowcase.utils

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <DB: ViewDataBinding> AppCompatActivity.dataBinding(@LayoutRes layoutRes: Int): Lazy<DB> {
    return lazy(LazyThreadSafetyMode.NONE) { DataBindingUtil.setContentView<DB>(this, layoutRes)}
}