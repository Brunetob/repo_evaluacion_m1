package com.example.evaluacionUno.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Conference {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null
    var title: String? = null
    var description: String? = null
    var city: String? = null
    @Column(name="total_assistants")
    var totalAssistants: Long? = null
}