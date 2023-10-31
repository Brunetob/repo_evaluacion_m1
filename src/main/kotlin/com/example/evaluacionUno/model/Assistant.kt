package com.example.evaluacionUno.model

import jakarta.persistence.*

@Entity
@Table(name = "assistant")
class Assistant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null
    @Column(name = "full_name")
    var fullName: String? = null
    var rolee: String? = null
    var age: Long? = null
    @Column(name = "conference_id")
    var conferenceId: Long? = null
}