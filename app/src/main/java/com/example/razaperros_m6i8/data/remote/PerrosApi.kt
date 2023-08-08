package com.example.razaperros_m6i8.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface PerrosApi {

    @GET("breeds/list/all")
    suspend fun getDataPerros(): Response<RazaPerros>

}