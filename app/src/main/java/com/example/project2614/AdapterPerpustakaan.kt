package com.example.project2614

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2614.com.example.project2614.PerpustakaanModel

class AdapterPerpustakaan (private val listBuku:List<PerpustakaanModel>) :RecyclerView.Adapter<AdapterPerpustakaan.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageP:ImageView = itemView.findViewById(R.id.imageViewCover1)
        val titleP:TextView = itemView.findViewById(R.id.textViewJudul1)
        val descP:TextView = itemView.findViewById(R.id.textViewSinopsis1)
        val artikelP:TextView = itemView.findViewById(R.id.textViewArtikel1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPerpustakaan.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_perpustakaan,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterPerpustakaan.ViewHolder, position: Int) {
        val modelPerpustakaan = listBuku[position]

        holder.imageP.setImageResource(modelPerpustakaan.imageP)
        holder.titleP.text = modelPerpustakaan.titleP
        holder.descP.text = modelPerpustakaan.descP
        holder.artikelP.text = modelPerpustakaan.artikelP
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }
}