package com.example.chaibin.controller.dto

import java.time.LocalDate
import java.time.LocalDateTime

class StudentResponseDto(
    val id: Long,
    val name: String,
    val birthDay: LocalDate,
)