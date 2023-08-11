package com.example.razaperros_m6i8.data

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {

        //Given(dado este valor)
        val unUrlEnString = "www.url"
        val unIdEnString = "unId"

        //When(hago esta acción)
        val resultadoTransformacion = unUrlEnString.toEntity(unIdEnString)

        //Then(espero este resultado)
        assertEquals(unIdEnString, resultadoTransformacion.razadetalle)
        assertEquals(unUrlEnString, resultadoTransformacion.url)

    }
}