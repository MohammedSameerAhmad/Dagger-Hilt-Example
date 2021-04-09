package `in`.utilitysoftwares.daggerhiltexample.ui

import `in`.utilitysoftwares.daggerhiltexample.Main
import `in`.utilitysoftwares.daggerhiltexample.QualifierExample
import `in`.utilitysoftwares.daggerhiltexample.R
import `in`.utilitysoftwares.daggerhiltexample.demo.Car
import `in`.utilitysoftwares.daggerhiltexample.viewmodels.PostViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val postViewModel : PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postViewModel.response.observe(this, Observer {
            Log.d("main", "onCreate: ${it[0].body}" )
        })
    }
}