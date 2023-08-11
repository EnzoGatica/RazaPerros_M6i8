package com.example.razaperros_m6i8.data

import com.example.razaperros_m6i8.data.local.RazaDetalleEntity

fun String.toEntity(id: String): RazaDetalleEntity = RazaDetalleEntity(id, this)