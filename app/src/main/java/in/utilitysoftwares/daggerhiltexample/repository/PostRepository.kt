package `in`.utilitysoftwares.daggerhiltexample.repository

import `in`.utilitysoftwares.daggerhiltexample.classes.PostServiceImp
import `in`.utilitysoftwares.daggerhiltexample.models.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(val postServiceImp: PostServiceImp) {

    fun getPost() : Flow<List<Post>> = flow {
        val response = postServiceImp.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)

}