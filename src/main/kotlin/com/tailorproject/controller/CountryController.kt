package com.tailorproject.controller

import com.tailorproject.dto.CountryDto
import com.tailorproject.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/countries")

class CountryController (
    private  val countryService: CountryService,)
{

    @GetMapping

    fun getAll(): List<CountryDto> {
        return countryService.getAll()
    }




}