package com.example.razaperros_m6i8.data.local

import androidx.room.Entity

@Entity(tableName = "tabla_razasDetalle", primaryKeys = ["razaDetalle","url"])
data class RazaDetalleEntity(
    val razaDetalle:String,
    val url: String
)
