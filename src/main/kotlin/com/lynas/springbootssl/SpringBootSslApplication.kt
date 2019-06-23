package com.lynas.springbootssl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringBootSslApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSslApplication>(*args)
}


@RestController
class Demo{

    @GetMapping("/")
    fun home() = "Hello https world"
}