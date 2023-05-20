package com.tailorproject.service.impl

import com.tailorproject.dto.CountryDto
import com.tailorproject.entity.CountryEntity
import com.tailorproject.repository.CountryRepository
import com.tailorproject.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(
    private  val  countryRepository: CountryRepository,
) : CountryService {

    override fun getAll(): List<CountryDto> {
        val findAll = countryRepository.findAll()
        val map = findAll.map {// it.toDto()


            CountryDto(
                id = it.id,
                population = it.population,
                name = it.name,


                )

        }
        return map
        


    }
}
//    private  fun CountryEntity.toDto(): CountryDto =
//
//        CountryDto(
//            id = this.id,
//            population = this.population,
//            name = this.name,
//            )
//    }

