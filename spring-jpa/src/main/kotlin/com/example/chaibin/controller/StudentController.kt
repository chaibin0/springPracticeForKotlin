package com.example.chaibin.controller

import com.example.chaibin.controller.dto.StudentResponseDto
import com.example.chaibin.service.StudentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(private val studentService: StudentService) {

    @GetMapping("/students/{studentId}")
    fun getStudents(@PathVariable studentId: Long?): StudentResponseDto {
        if (studentId == null) {
            throw RuntimeException()
        }

        val student = studentService.getStudent(studentId) ?: throw RuntimeException()

        return StudentResponseDto(
            id = student.id,
            name = student.name,
            birthDay = student.birthDay
        )
    }
}