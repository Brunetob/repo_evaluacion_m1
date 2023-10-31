package com.example.evaluacionUno.service

import com.example.evaluacionUno.model.Assistant
import com.example.evaluacionUno.model.Conference
import com.example.evaluacionUno.repository.AssistantRepository
import com.example.evaluacionUno.repository.ConferenceRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Repository
import org.springframework.web.server.ResponseStatusException

@Repository
class AssistantService {
    @Autowired
    lateinit var assistantRepository: AssistantRepository
    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list ():List<Assistant>{
        return assistantRepository.findAll()
    }

    //PETICIONES POST
    //clase service
    fun save(assistant: Assistant): Assistant {
        // Comprobación de la clave foránea
        try {
            // Buscar la conferencia por ID
            assistant.conferenceId?.let { conferenceRepository.findById(it) }
                ?: throw EntityNotFoundException("No se encontró la conferencia con el ID proporcionado")

            return assistantRepository.save(assistant)
        } catch (ex: EntityNotFoundException) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message, ex)
        }
    }
}