package com.example.chaibin.entity

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "tb_student")
class Student(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private val id: Long,
    private val name: String,
    private val birthDay: LocalDate,
    private val createdAt: LocalDateTime,
    private val createdBy: String
)
