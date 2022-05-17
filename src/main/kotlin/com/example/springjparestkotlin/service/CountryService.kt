package com.example.springjparestkotlin.service

import com.example.springjparestkotlin.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>
}