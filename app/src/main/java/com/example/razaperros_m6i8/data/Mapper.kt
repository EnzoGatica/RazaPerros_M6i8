package com.example.razaperros_m6i8.data

import com.example.razaperros_m6i8.data.local.RazaDetalleEntity
import com.example.razaperros_m6i8.data.local.RazaEntity

fun String.toEntity(id: String): RazaDetalleEntity = RazaDetalleEntity(id, this)//funcion extension

fun String.toRazasEntity(): RazaEntity = RazaEntity(this) //funcion de extencion