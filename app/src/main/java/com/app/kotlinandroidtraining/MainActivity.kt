package com.app.kotlinandroidtraining

import android.graphics.BlurMaskFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.RoundedCorner
import android.widget.Toast
import com.app.kotlinandroidtraining.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val internet : Boolean = NetworkChecker(this).isInternetConnected
            Toast.makeText(this, internet.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}