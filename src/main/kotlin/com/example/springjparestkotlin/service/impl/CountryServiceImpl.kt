package com.example.springjparestkotlin.service.impl

import com.example.springjparestkotlin.dto.CountryDto
import com.example.springjparestkotlin.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl : CountryService {
    override fun getAll(): List<CountryDto> {
        return listOf(
            CountryDto(1,"Россия",150_000_000),
            CountryDto(2,"Украина",42_000_000)
        )
    }
}