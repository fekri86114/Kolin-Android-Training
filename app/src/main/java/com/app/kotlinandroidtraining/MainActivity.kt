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

        binding.buttonLoadImage.setOnClickListener {

            val url = "https://dev.java/assets/images/java-logo-vert-blk.png"

            Glide.with(this)
                .load(url)
//                .diskCacheStrategy( DiskCacheStrategy.AUTOMATIC )
//                .placeholder(R.drawable.ic_launcher_background)
//                .error(R.drawable.broken_img)
//                .override(200, 200) // you can change image size
//                .skipMemoryCache(true) // if it's true it doesn't cache on phone disk
                .into(binding.imgMain)

//            Picasso.get()
//                .load(url)
//                .error(R.drawable.broken_img)
//                .into(binding.imgMain, object: Callback{
//                    override fun onSuccess() {
//                        Toast.makeText(this@MainActivity, "HEY!!", Toast.LENGTH_SHORT).show()
//                    }
//
//                    override fun onError(e: Exception?) {
//                        Toast.makeText(this@MainActivity, "DENIED!!", Toast.LENGTH_SHORT).show()
//                    }
//
//                })
        }
    }
}