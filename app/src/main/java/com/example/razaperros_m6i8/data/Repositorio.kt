package com.example.razaperros_m6i8.data

import com.example.razaperros_m6i8.data.local.RazaDao
import com.example.razaperros_m6i8.data.local.RazaEntity
import com.example.razaperros_m6i8.data.remote.PerrosApi

class Repositorio(private val perrosApi: PerrosApi,private val razaDao: RazaDao) {

    suspend fun getRazas(){
        val response = perrosApi.getDataPerros()
        if(response.isSuccessful){
            val message = response.body()!!.message// solo scando la aprte de message, sin stattus
            val keys = message.keys

            keys.forEach{
                val razaEntity = RazaEntity(it)
                razaDao.insertRaza(razaEntity)
            }

        }

    }

}