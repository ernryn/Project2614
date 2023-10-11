package com.example.project2614

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHome (private val listBuku:List<BukuModel>) :RecyclerView.Adapter<AdapterHome.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageViewCover1)
        val title:TextView = itemView.findViewById(R.id.textViewJudul1)
        val desc:TextView = itemView.findViewById(R.id.textViewSinopsis1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHome.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_home,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
        val modelBuku = listBuku[position]

        holder.image.setImageResource(modelBuku.image)
        holder.title.text = modelBuku.title
        holder.desc.text = modelBuku.desc
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }
}