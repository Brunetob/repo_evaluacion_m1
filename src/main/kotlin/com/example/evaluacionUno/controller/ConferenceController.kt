package com.example.evaluacionUno.controller

import com.example.evaluacionUno.model.Conference
import com.example.evaluacionUno.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Conference")
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun list ():List <Conference>{
        return conferenceService.list()
    }
    //Peticiones post - Clase controller
    @PostMapping
    fun save (@RequestBody modelo:Conference): ResponseEntity<Conference> {
        return ResponseEntity(conferenceService.save(modelo), HttpStatus.OK)
    }
}