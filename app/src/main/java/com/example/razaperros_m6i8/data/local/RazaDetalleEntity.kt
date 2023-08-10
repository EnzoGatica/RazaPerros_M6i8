package com.example.razaperros_m6i8.data.local

import androidx.room.Entity

@Entity(tableName = "tabla_razasdetalle", primaryKeys = ["razaDetalle","url"])
data class RazaDetalleEntity(
    val razadetalle:String,
    val url: String
)
