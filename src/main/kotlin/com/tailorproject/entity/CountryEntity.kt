package com.tailorproject.entity

import jakarta.persistence.*

@Entity
@Table(name = "country")
class CountryEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val  population: Int = 0,
    val  name: String = "",

)
