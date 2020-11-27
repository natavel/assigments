package ru.cosiness.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentMoviesDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_movie_details)
    }
}