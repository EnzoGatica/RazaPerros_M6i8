package com.example.razaperros_m6i8.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_razas")
class RazaEntity (
    val razas: String)
{
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}