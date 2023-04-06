package com.tailorproject.service

import com.tailorproject.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>
}