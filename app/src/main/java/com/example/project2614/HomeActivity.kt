package com.example.project2614

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val btnBookKidActivity: Button = this.findViewById(R.id.buttonMenu1)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
                        "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4,"Mermaid to Rescue",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        //set adapter
        val adapter = AdapterHome(data)
        //set adapter ke recycler view
        rvBuku.adapter = adapter

        btnBookKidActivity.setOnClickListener {
            val intent = Intent(this, BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}