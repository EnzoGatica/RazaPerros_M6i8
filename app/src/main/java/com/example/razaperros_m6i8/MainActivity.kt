package com.example.razaperros_m6i8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
[] 2 pantallas: Listado y detalle
[x] Permiso de internet
[x] ViewBinding
[x] Dependencias: Coil, Room, Retrofit, navigation, viewModel
[x] Remoto:
    [x] Dataclass
    [x] API (interfaz)
    [x] Retrofit
[x] Local:
    [x] Database
    [x] Entity
    [x] DAO
[x] Repositorio
[] navigation
[] Listado: RecyclerView + ViewHolder + Adapter
[] Detalle: RecyclerView + ViewHolder + Adapter


 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}