package com.example.razaperros_m6i8.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun insertRaza(razaEntity: RazaEntity)

    //para pruebas android
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRaza(razaEntity: List<RazaEntity>)

    @Query("Select * from tabla_razas order by raza ASC")
    fun getRazas(): LiveData<List<RazaEntity>>


    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun insertDetallePerro(razaDetalleEntity: RazaDetalleEntity)

    @Query("Select * from tabla_razasdetalle where razadetalle like :id")
    fun getRazaDetalle(id: String): LiveData<List<RazaDetalleEntity>>

}