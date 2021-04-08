package `in`.utilitysoftwares.daggerhiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/**
 *
 * This is the main component which holds all the dependencies required over all the app
 *
 * */
@HiltAndroidApp
class BaseApplication : Application() {
}