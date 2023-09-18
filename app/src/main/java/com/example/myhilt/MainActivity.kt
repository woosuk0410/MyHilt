package com.example.myhilt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var factory: AlternativeCarFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //this works fine
//        val altCar = factory.getInstance()
//        altCar.accel()


        // this always makes UninitializedPropertyAccessException a
        car.accel()

    }
}