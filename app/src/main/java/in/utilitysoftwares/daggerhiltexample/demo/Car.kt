package `in`.utilitysoftwares.daggerhiltexample.demo

import android.util.Log
import javax.inject.Inject

/**
 * Constructor inject
 * this is where we are providing the engine object and wheel object dependency
 *
 * */
class Car @Inject constructor(private val engine : Engine, private val wheel : Wheel){

    fun getCar(){

        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "car is running ")

    }
}