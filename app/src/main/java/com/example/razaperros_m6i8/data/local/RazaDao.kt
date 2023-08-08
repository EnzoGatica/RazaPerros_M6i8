package com.example.razaperros_m6i8.data.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface RazaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun insertRaza(razaEntity: RazaEntity)

    @Query("Select * from tabla_razas order by razas desc")
    fun getRazas(): LiveData<List<RazaEntity>>

}