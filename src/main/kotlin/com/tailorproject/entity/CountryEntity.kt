package com.tailorproject.entity

import jakarta.persistence.*
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.GenerationType

@Entity
@Table(name = "country")
class CountryEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @Column( name ="population")
    val  population: Int ,
    @Column( name ="name")
    val  name: String ,

)
