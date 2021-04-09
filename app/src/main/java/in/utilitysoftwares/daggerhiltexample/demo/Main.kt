package `in`.utilitysoftwares.daggerhiltexample

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}

class ImplementationOne @Inject constructor(private val name :  String) : One{
    override fun getName(){
        Log.d("main", "My Name is $name from ImplementationOne class")

    }
}


class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getName()
    }
}

/*@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule{

    @Binds
    @Singleton
    abstract fun binding(implementationOne: ImplementationOne) : One

}*/

// another way to provide interface dependency

@Module
@InstallIn(ApplicationComponent::class)
class  AppModule{

    @Provides
    @Singleton
    fun getName(): String  = "sameer"

    @Provides
    @Singleton
    fun binding(name : String) : One = ImplementationOne(name)

}
