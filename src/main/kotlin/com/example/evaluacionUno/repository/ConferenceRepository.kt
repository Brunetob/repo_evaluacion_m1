package com.example.evaluacionUno.repository

import com.example.evaluacionUno.model.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service
interface ConferenceRepository : JpaRepository<Conference, Long?> {
    fun  findByid (id: Long?): Conference?
}