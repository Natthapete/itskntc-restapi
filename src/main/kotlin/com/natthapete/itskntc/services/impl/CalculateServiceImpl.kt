package com.natthapete.itskntc.services.impl

import com.natthapete.itskntc.services.CalculateService
import org.springframework.stereotype.Service

@Service
class CalculateServiceImpl : CalculateService {
    override fun added(first: Int, second: Int): Int {
        return first + second
    }

    override fun sub(first: Int, second: Int): Int {
        return first - second
    }

    override fun multiply(first: Int, second: Int): Int {
        return first * second
    }

    override fun division(first: Int, second: Int): Int {
        return first / second
    }
}