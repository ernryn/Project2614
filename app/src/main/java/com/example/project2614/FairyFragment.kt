package com.example.project2614

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FairyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_fairy, container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerViewBuku)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(requireContext())

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book8,"My Little Book of Fairy Tales",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book9,"The Gingerbread Man",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book10,"Puss in Boots",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        //set adapter
        val adapter = AdapterHome(data)

        //set adapter ke recycler view
        rvBuku.adapter = adapter

        return rootView
    }
}
