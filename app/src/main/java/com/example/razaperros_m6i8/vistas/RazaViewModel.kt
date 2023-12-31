package com.example.razaperros_m6i8.vistas

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.razaperros_m6i8.data.Repositorio
import com.example.razaperros_m6i8.data.local.RazaDatabase
import com.example.razaperros_m6i8.data.remote.PerrosRetrofit
import kotlinx.coroutines.launch

class RazaViewModel(application: Application): AndroidViewModel(application) {

    private val repositorio: Repositorio

    fun razaLiveData() = repositorio.obtenerRazaEntentity()

    fun detalleLiveData(id: String) = repositorio.obtenerDetalleEntentity(id)

    init {
        val api = PerrosRetrofit.gesRetroFitAves()
        val razaDatabase = RazaDatabase.getDatabase(application).getRazaDao()
        repositorio = Repositorio(api,razaDatabase)
    }

    fun getAllRazas() = viewModelScope.launch {
        repositorio.getRazas()
    }

    fun getDetallePerroVM(id: String) = viewModelScope.launch {
        repositorio.getDetallePerro(id)
    }


}