package com.example.razaperros_m6i8.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.razaperros_m6i8.data.local.RazaDao
import com.example.razaperros_m6i8.data.local.RazaDetalleEntity
import com.example.razaperros_m6i8.data.local.RazaEntity
import com.example.razaperros_m6i8.data.remote.PerrosApi

class Repositorio(private val perrosApi: PerrosApi,private val razaDao: RazaDao) {

    fun obtenerRazaEntentity(): LiveData<List<RazaEntity>> = razaDao.getRazas()

    fun obtenerDetalleEntentity(id: String): LiveData<List<RazaDetalleEntity>> = razaDao.getRazaDetalle(id)
    suspend fun getRazas(){
        try {
            val response = perrosApi.getDataPerros()
            if (response.isSuccessful) {
                val message =
                    response.body()!!.message// solo scando la parte de message, sin stattus
                val keys = message.keys

                keys.forEach {
                    val razaEntity = RazaEntity(it)
                    razaDao.insertRaza(razaEntity)
                }

            } else {
                Log.e("repositorio", response.errorBody().toString())
            }
        }catch (exception: Exception){
            Log.e("catch","")
        }
    }

    suspend fun getDetallePerro(id: String){
        try {
            val response = perrosApi.getDetallePerro(id)
            if(response.isSuccessful){
                response.body()!!.message.forEach{
                    val razaDetalleEntity = RazaDetalleEntity(id,it)
                    razaDao.insertDetallePerro(razaDetalleEntity)
                }


            }else{
                Log.e("repositorio", response.errorBody().toString())
            }
        }catch (exception: Exception){
            Log.e("catch","")
        }

    }
}