package com.example.chaibin.repository

import com.example.chaibin.entity.Student
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import java.time.LocalDate
import java.time.LocalDateTime

@DataJpaTest
class StudentRepositoryTest(
    @Autowired
    var studentRepository: StudentRepository
) : FreeSpec({
    "저장테스트" - {
        val student = Student(1, "이름", LocalDate.now(), LocalDateTime.now(), "ADMIN")

        val savedStudent = studentRepository.save(student)
        savedStudent.id shouldBe 1
    }
})