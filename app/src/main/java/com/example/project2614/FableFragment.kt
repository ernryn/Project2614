package com.example.project2614

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FableFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_fable, container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(requireContext())

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book8,"33 Binatang Paling Heboh",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book10,"Mahkota Indah Sang Jerapah",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book13,"Ayam Bijaksana dan Ular yang Berlapang Dada",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
