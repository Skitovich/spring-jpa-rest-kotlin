package com.example.springjparestkotlin.controller

import com.example.springjparestkotlin.dto.CountryDto
import com.example.springjparestkotlin.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class CountryController(
    private val countryService: CountryService
) {
    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAll()
}