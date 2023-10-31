package com.example.evaluacionUno.controller

import com.example.evaluacionUno.model.Assistant
import com.example.evaluacionUno.model.Conference
import com.example.evaluacionUno.repository.AssistantRepository
import com.example.evaluacionUno.service.AssistantService
import com.example.evaluacionUno.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@Controller
@RestController
@RequestMapping("/Assistant")
@Repository
class AssistantController {
    @Autowired
    lateinit var assistantService: AssistantService

    @GetMapping
    fun list ():List <Assistant>{
        return assistantService.list()
    }
    //Peticiones post - Clase controller
    @PostMapping
    fun save (@RequestBody modelo:Assistant): ResponseEntity<Assistant> {
        return ResponseEntity(assistantService.save(modelo), HttpStatus.OK)
    }
}