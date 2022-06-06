package com.example.mystore.base

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope

abstract class BaseActivity : FragmentActivity(), LifecycleOwner, CoroutineScope {
    override val coroutineContext = lifecycleScope.coroutineContext
}