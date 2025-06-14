package com.torre.b2c2c_tfg.domain.usecase

import com.torre.b2c2c_tfg.data.model.Empresa
import com.torre.b2c2c_tfg.domain.repository.EmpresaRepository

// class GetEmpresaUseCase(private val repository: EmpresaRepository) {

//   suspend operator fun invoke(): Empresa = repository.getEmpresa()
// }

class GetEmpresaUseCase(private val empresaRepository: EmpresaRepository) {
    suspend operator fun invoke(id: Long): Empresa? {
        return empresaRepository.getEmpresaById(id)
    }
}