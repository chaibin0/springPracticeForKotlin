package com.example.chaibin.service

import com.example.chaibin.entity.Student
import com.example.chaibin.repository.StudentRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {
    fun getStudent(studentId: Long): Student? = studentRepository.findByIdOrNull(studentId)

}
