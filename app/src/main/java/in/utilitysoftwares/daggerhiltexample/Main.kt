package `in`.utilitysoftwares.daggerhiltexample

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}

class ImplementationOne @Inject constructor() : One{
    override fun getName(){
        Log.d("main", "My Name is Sameer from ImplementationOne class")

    }
}


class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getName()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule{

    @Binds
    @Singleton
    abstract fun binding(implementationOne: ImplementationOne) : One

}
