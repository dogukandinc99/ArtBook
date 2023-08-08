package com.example.artbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.artbook.databinding.ActivityArtBinding

class ArtActivity : AppCompatActivity() {

    lateinit var binding: ActivityArtBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_art)
        binding = ActivityArtBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }

    fun savebtnclick(view: View) {

    }

    fun selectimage(view: View) {

    }
}