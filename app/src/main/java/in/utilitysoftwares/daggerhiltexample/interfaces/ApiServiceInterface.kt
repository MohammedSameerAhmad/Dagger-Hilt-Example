package `in`.utilitysoftwares.daggerhiltexample.interfaces

import `in`.utilitysoftwares.daggerhiltexample.models.Post
import retrofit2.http.GET

interface ApiServiceInterface {
    @GET("post")
    suspend fun getPost() : List<Post>
}