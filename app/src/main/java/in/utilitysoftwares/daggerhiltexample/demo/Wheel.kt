package `in`.utilitysoftwares.daggerhiltexample.demo

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()

    fun getWheel(){
        Log.d("Wheel ", "Wheel Created")
    }
}