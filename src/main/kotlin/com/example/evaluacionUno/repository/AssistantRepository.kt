package com.example.evaluacionUno.repository

import com.example.evaluacionUno.model.Assistant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service
interface AssistantRepository : JpaRepository<Assistant, Long?> {
    fun  findByid (id: Long?): Assistant?
}