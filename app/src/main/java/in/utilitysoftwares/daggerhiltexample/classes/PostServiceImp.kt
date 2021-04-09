package `in`.utilitysoftwares.daggerhiltexample.classes

import `in`.utilitysoftwares.daggerhiltexample.interfaces.ApiServiceInterface
import `in`.utilitysoftwares.daggerhiltexample.models.Post
import javax.inject.Inject

class PostServiceImp @Inject constructor(private val apiServiceInterface: ApiServiceInterface) {
    suspend fun getPost()  = apiServiceInterface.getPost()
}