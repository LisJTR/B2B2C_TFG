package com.torre.b2c2c_tfg.domain.repository

import com.torre.b2c2c_tfg.data.model.Alumno

interface AlumnoRepository {
    suspend fun getAlumno(): Alumno
    suspend fun getAlumnoById(id: Long): Alumno
    suspend fun updateAlumno(alumno: Alumno): Alumno
    suspend fun createAlumno(alumno: Alumno): Alumno
    suspend fun getTitulacionesUnicas() : List<String>
    suspend fun getAllAlumnos(): List<Alumno>

}