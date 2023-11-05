package com.itgenius.studentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentServiceApplication

//@RestController
//@RequestMapping("/api/v1/students")
//class StudentController {
//
//	@GetMapping("/test")
//    fun getTest(): String {
//        return "Hello World from Spring Boot with Kotlin"
//    }
//
//	@GetMapping
//	fun getStudents(): List<Student> {
//		return listOf(
//			Student(1, "John", 20),
//			Student(2, "Mary", 21),
//			Student(3, "Peter", 22),
//			Student(4, "David", 23),
//			Student(5, "Bob", 24)
//		)
//	}
//}

//data class Student(
//	val int: Long,
//	val name: String,
//	val age: Int
//)

fun main(args: Array<String>) {
	runApplication<StudentServiceApplication>(*args)
}