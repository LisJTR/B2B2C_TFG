package com.torre.b2c2c_tfg.domain.usecase

import com.torre.b2c2c_tfg.data.model.Notificacion
import com.torre.b2c2c_tfg.domain.repository.NotificacionRepository

class CrearNotificacionUseCase(private val repository: NotificacionRepository) {
    suspend operator fun invoke(notificacion: Notificacion): Boolean {
        return repository.crearNotificacion(notificacion)
    }
}