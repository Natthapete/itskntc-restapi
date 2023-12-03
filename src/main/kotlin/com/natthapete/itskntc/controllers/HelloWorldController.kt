package com.natthapete.itskntc.controllers

import com.natthapete.itskntc.services.HelloWorldService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController(
    val helloWorldService: HelloWorldService
) {

    @GetMapping("/")
    fun getHelloWorld(): String = helloWorldService.getHello()

    // http://localhost:8080/added/2/2
    // 4
    @GetMapping("/{name}")
    fun getHelloName(@PathVariable name: String) : String = "Hello, $name"
}