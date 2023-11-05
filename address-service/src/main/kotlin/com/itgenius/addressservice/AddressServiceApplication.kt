package com.itgenius.addressservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AddressServiceApplication

//@RestController
//@RequestMapping("/api/v1/addresses")
//class AddressController {
//
//    @GetMapping("/test")
//    fun getTest(): String {
//        return "Hello World from Spring Boot with Kotlin"
//    }
//
//    @GetMapping
//    fun getAddresses(): List<Address> {
//        return listOf(
//            Address(1, "John", 20),
//            Address(2, "Mary", 21),
//            Address(3, "Peter", 22),
//            Address(4, "David", 23),
//            Address(5, "Bob", 24)
//        )
//    }
//
//}

//data class Address(
//        val id: Int,
//        val name: String,
//        val age: Int
//)

fun main(args: Array<String>) {
    runApplication<AddressServiceApplication>(*args)
}
