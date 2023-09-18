package com.example.myhilt

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GasolineCar @Inject constructor() : Car() {
}