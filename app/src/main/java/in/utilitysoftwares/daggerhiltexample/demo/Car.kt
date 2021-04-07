package `in`.utilitysoftwares.daggerhiltexample.demo

import android.util.Log
import javax.inject.Inject

class Car {

    @Inject
    constructor()

    fun getCar(){
        Log.d("main", "car is running ")
    }
}