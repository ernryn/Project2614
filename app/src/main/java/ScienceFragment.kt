package com.example.project2614

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ScienceFragmentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_science, container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(requireContext())

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book11,"Science World for Kids",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book12,"Kecil-kecil Jadi Einstein",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book13,"Taman Ajaib | Ramuan Obat yang Menyembuhkan",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter

        return rootView
    }
}
