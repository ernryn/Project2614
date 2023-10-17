package com.example.project2614

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class AboutUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val location: ImageView = findViewById(R.id.imageView16)
        val call: ImageView = findViewById(R.id.imageView35)
        val web: ImageView = findViewById(R.id.imageView37)

        // Open location on map
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122.3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }

        // Dial number
        call.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:082155186294").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            if (callIntent.resolveActivity(packageManager) != null) {
                startActivity(callIntent)
            }
        }

        // Open web
        web.setOnClickListener {
            val webIntent: Intent = Uri.parse("https://home.amikom.ac.id/").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            if (webIntent.resolveActivity(packageManager) != null) {
                startActivity(webIntent)
            }
        }
    }
}
