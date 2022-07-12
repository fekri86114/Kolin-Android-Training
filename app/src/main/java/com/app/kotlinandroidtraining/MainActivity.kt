package com.app.kotlinandroidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.kotlinandroidtraining.databinding.ActivityMainBinding
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

            Picasso.get()
                .load(url)
                .error(R.drawable.broken_img)
                .into(binding.imgMain, object: Callback{
                    override fun onSuccess() {
                        Toast.makeText(this@MainActivity, "HEY!!", Toast.LENGTH_SHORT).show()
                    }

                    override fun onError(e: Exception?) {
                        Toast.makeText(this@MainActivity, "DENIED!!", Toast.LENGTH_SHORT).show()
                    }

                })
        }
    }
}