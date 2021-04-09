package `in`.utilitysoftwares.daggerhiltexample.classes

import `in`.utilitysoftwares.daggerhiltexample.interfaces.ApiServiceInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
class ApiModule {

    @Provides
    @BaseUrl
    fun provideBaseUrl() : String = "https://jsonplaceholder.typicode.com/"

    @Provides
    @Singleton
    fun providesRetorfitBuilder(@BaseUrl baseUrl : String) : Retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providePostApiService(retrofit: Retrofit) : ApiServiceInterface = retrofit.create(ApiServiceInterface::class.java)

}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BaseUrl