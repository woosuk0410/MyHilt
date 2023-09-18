package com.example.myhilt

import android.app.ActivityManager
import android.content.Context
import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ModuleProvides {

    @Provides
    fun getCar() :Car {
        return if(true) // some condition
            ElectricCar()
        else
            GasolineCar()
    }

}