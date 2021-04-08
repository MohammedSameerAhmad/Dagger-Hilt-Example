package `in`.utilitysoftwares.daggerhiltexample.demo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()

    fun getEngine(){
        Log.d(" Engine ", "Engine Created")
    }
}