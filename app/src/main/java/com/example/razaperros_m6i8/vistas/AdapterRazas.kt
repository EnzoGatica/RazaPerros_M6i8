package com.example.razaperros_m6i8.vistas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.razaperros_m6i8.data.local.RazaEntity
import com.example.razaperros_m6i8.databinding.ItemRazasBinding

/*
[x ] item layout
[x] agregar constraints
[x ] implementar clase Adapter
[x] heredar RecyclerView.Adapter
[x] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[x ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[x] Agregar constructor
[x] crear objeto, data class
[x] Crear lista
[x] asignar tamaño de la lista en getItemCount
[x] definir Binding Class del Item
[x] cambiar view por el binding
[x] declarar variable item en onBindViewHolder
[x] implementar binding en clase viewHolder
[x] Adapter+ view holder
[ x] obtener los datos


 */
class AdapterRazas : RecyclerView.Adapter<AdapterRazas.ItemRazasViewHolder>() {

    lateinit var binding: ItemRazasBinding
    private val listItemRazas = mutableListOf<RazaEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRazasViewHolder {
        binding = ItemRazasBinding.inflate(LayoutInflater.from(parent.context),parent, false)

        return ItemRazasViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listItemRazas.size
    }

    override fun onBindViewHolder(holder: ItemRazasViewHolder, position: Int) {
        val raza = listItemRazas[position]
        holder.bind(raza)
    }

    fun setData(raza: List<RazaEntity>){
        this.listItemRazas.clear()
        this.listItemRazas.addAll(raza)
        notifyDataSetChanged()
    }

    class ItemRazasViewHolder(val razasVistas: ItemRazasBinding): RecyclerView.ViewHolder(razasVistas.root) {

        fun bind(raza:RazaEntity){
            razasVistas.txtRaza.text = raza.raza

            //razas.cardViewRazas.setOnClickListener{ }
        }

    }

}