package com.example.project2614

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val btnBookKidActivity: Button = this.findViewById(R.id.buttonMenu1)

        btnBookKidActivity.setOnClickListener {
            val intent = Intent(this, BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}