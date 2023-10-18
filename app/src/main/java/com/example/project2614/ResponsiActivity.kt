package com.example.project2614

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project2614.com.example.project2614.PerpustakaanModel

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val location: ImageView = findViewById(R.id.imageView4)
        val rvBuku: RecyclerView = findViewById(R.id.recyclerViewBuku)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<PerpustakaanModel>()
        data.add(PerpustakaanModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet", "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(PerpustakaanModel(R.drawable.book2,"Ade's Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet", "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(PerpustakaanModel(R.drawable.book4,"Mermaid to Rescue",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet", "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        //set adapter
        val adapter = AdapterPerpustakaan(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter


        // Open location on map
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122.3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }

    }
}