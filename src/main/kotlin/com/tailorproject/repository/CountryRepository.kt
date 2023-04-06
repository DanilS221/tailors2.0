package com.tailorproject.repository

import com.tailorproject.entity.CountryEntity
import org.springframework.data.repository.CrudRepository

interface CountryRepository: CrudRepository<CountryEntity, Int>