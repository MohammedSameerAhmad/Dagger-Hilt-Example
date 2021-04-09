package `in`.utilitysoftwares.daggerhiltexample

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

/***
 * when a dependency requires two objects with same type
 * then we can differentiate with giving a qualifier name to those dependencies
 * in our case QualifierExample class requires two Strings firstName and lastName which is same type String
 * so we have created two qualifier as fName and lName to differentiate different objects
 *
 * */

class QualifierExample @Inject constructor(
    @fName
    private val firstName : String,
    @lName
    private val lastName : String
){
    fun getName(){
        Log.d("QualifierExample", "My full name is $firstName $lastName")
    }
}

@Module
@InstallIn(ApplicationComponent::class)
class AppModuleQualifier{

    @Provides
    @Singleton
    @fName
    fun getFirstName()  = "Sameer"

    @Provides
    @Singleton
    @lName
    fun getLastName() = "Khateeb"

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class fName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class lName