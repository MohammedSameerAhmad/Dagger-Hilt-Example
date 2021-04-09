package `in`.utilitysoftwares.daggerhiltexample.viewmodels

import `in`.utilitysoftwares.daggerhiltexample.models.Post
import `in`.utilitysoftwares.daggerhiltexample.repository.PostRepository
import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.catch

class PostViewModel
@ViewModelInject
constructor(val postRepository: PostRepository) : ViewModel() {

    var response : LiveData<List<Post>> = postRepository.getPost()
        .catch { e ->
            Log.e("main", e.message.toString() )
        }.asLiveData()
}