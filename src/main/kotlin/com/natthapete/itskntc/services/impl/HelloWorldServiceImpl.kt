package com.natthapete.itskntc.services.impl

import com.natthapete.itskntc.services.HelloWorldService
import org.springframework.stereotype.Service

@Service
class HelloWorldServiceImpl : HelloWorldService {

    override fun getHello(): String {
        return "Hello, World 1"
    }
}