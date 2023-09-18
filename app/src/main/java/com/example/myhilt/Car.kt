package com.example.myhilt

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class Car @Inject constructor() {

    @Inject
    lateinit var engine: Engine

    fun accel() {
        engine.accel()
    }
}