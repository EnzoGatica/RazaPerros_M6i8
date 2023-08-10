package com.example.razaperros_m6i8.vistas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.razaperros_m6i8.data.local.RazaDetalleEntity
import com.example.razaperros_m6i8.databinding.ItemDetallePerroBinding

class AdapterDetalle: RecyclerView.Adapter<AdapterDetalle.DetallePerroViewHolder>() {

    lateinit var binding: ItemDetallePerroBinding
    private val listDetalleperro = mutableListOf<RazaDetalleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallePerroViewHolder {
        binding = ItemDetallePerroBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return DetallePerroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDetalleperro.size
    }

    override fun onBindViewHolder(holder: DetallePerroViewHolder, position: Int) {
        val perro = listDetalleperro[position]
        holder.bind(perro)
    }

    fun setDataDetalle(detalle : List<RazaDetalleEntity>){
        this.listDetalleperro.clear()
        this.listDetalleperro.addAll(detalle)
        notifyDataSetChanged()
    }

    class DetallePerroViewHolder(val perrovista: ItemDetallePerroBinding): RecyclerView.ViewHolder(perrovista.root){
        fun bind(detalle: RazaDetalleEntity){
            perrovista.imageDogsDetail.load(detalle.url)
        }
    }
}