package com.example.myapplication

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.logueoconfragmentsynavegacion.R
import com.example.logueoconfragmentsynavegacion.fiat



class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val kode = arrayOf("Fiat",
        "Peugot", "Chevrolet", "Toyota",
        "Toyota", "Volkswagen", "Renault",
        "Jeep")

    private val kategori = arrayOf("@drawable/fiatkronos", "@drawable/peugot208",
        "@drawable/chvroletcruze", "@drawable/toyotaetios", "@drawable/toyotacorollacross",
        "@drawable/volkgoltrend", "@drawable/renaultsandero", "@drawable/jeeprenegade", )




    private val isi = arrayOf("Kronos",
        "208", "Cruze", "Etios",
        "Corolla Cross", "Gol Trend", "Sandero",
        "Renegade")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemKode: TextView
        var itemKategori: ImageView
        var itemIsi: TextView

        init {
            itemKode = itemView.findViewById(R.id.kodePertanyaan)
            itemKategori = itemView.findViewById(R.id.kategori)
            itemIsi = itemView.findViewById(R.id.isiPertanyaan)

            itemView.setOnClickListener {
                Toast.makeText(itemKode.context, itemKode.text, Toast.LENGTH_SHORT).show()

            }

            }
        }



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardview, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemKode.text = kode[i]
        viewHolder.itemIsi.text = isi[i]

        val imageName = kategori[i]
        val imageResId = viewHolder.itemView.context.resources.getIdentifier(imageName, "drawable", viewHolder.itemView.context.packageName)
        viewHolder.itemKategori.setImageResource(imageResId)
    }

    override fun getItemCount(): Int {
        return kode.size
    }
}



