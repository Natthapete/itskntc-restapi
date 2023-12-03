package com.natthapete.itskntc.controllers

import com.natthapete.itskntc.services.CalculateService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculate")
class CalculateController (
    val calculateService: CalculateService
) {

    @GetMapping(value = ["/added"], params = ["first", "second"])
    fun getAddCalculate(
        @RequestParam first: Int,
        @RequestParam second: Int): Int = calculateService.added(first, second)

    @GetMapping(value = ["/sub"], params = ["first", "second"])
    fun getSubCalculate(
        @RequestParam first: Int,
        @RequestParam second: Int): Int = calculateService.sub(first, second)

    @GetMapping(value = ["/multiply"], params = ["first", "second"])
    fun getMultiplyCalculate(
        @RequestParam first: Int,
        @RequestParam second: Int): Int = calculateService.multiply(first, second)

    @GetMapping(value = ["/division"], params = ["first", "second"])
    fun getDivisionCalculate(
        @RequestParam first: Int,
        @RequestParam second: Int): Int = calculateService.division(first, second)
}