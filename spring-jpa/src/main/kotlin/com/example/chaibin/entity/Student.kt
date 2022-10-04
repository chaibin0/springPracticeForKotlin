package com.example.chaibin.entity

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "tb_student")
class Student(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long,
    val name: String,
    val birthDay: LocalDate,
    val createdAt: LocalDateTime,
    val createdBy: String
)
