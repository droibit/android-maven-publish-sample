package com.github.droibit.sample.publish

import android.app.Application
import com.github.droibit.sample.library_1.Library1
import com.github.droibit.sample.library_2.Library2

class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Library1
        Library2
    }
}