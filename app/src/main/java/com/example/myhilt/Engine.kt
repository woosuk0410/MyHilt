package com.example.myhilt

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Engine @Inject constructor() {

    fun accel()  {
        Log.e("SAMPLE", "engine accel")
    }

}