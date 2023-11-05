package com.itgenius.addressservice.controllers

import com.itgenius.addressservice.models.Address
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/addresses")
class AddressController {

    @GetMapping("/test")
    fun getTest(): String {
        return "Hello World from Spring Boot with Kotlin"
    }

    @GetMapping
    fun getAddresses(): List<Address> {
        return listOf(
            Address(1, "John", 20),
            Address(2, "Mary", 21),
            Address(3, "Peter", 22),
            Address(4, "David", 23),
            Address(5, "Bob", 24)
        )
    }

    @GetMapping("/{id}")
    fun getAddress(@PathVariable id: Int): Address {
        return Address(id, "John", 20)
    }

    @PostMapping
    fun createAddress(@RequestBody address: Address): Address {
        return address
    }

    @PutMapping("/{id}")
    fun updateAddress(@PathVariable id: Int, @RequestBody address: Address): Address {
        return address
    }

    @DeleteMapping("/{id}")
    fun deleteAddress(@PathVariable id: Int): String {
        return "Address id $id has been deleted"
    }

}