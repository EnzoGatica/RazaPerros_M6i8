package com.example.razaperros_m6i8.data

import org.junit.Assert.*

import org.junit.Test

class MapperKtTest {

    @Test
    fun toRazasEntity() {

        val unaRaza = "breed"

        //When(hago esta acción)
        val resultadoTransformacionRaza = unaRaza.toRazasEntity()

        //Then(espero este resultado)
        assertEquals(unaRaza, resultadoTransformacionRaza.raza)

    }
}