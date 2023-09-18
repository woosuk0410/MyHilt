package com.example.myhilt

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AlternativeCarFactory @Inject constructor() {

    @Inject
    lateinit var electricCar: ElectricCar

    @Inject
    lateinit var gasolineCar: GasolineCar

    fun getInstance(): Car {
        return if (true) electricCar else gasolineCar
    }
}