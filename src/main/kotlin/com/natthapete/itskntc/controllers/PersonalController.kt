package com.natthapete.itskntc.controllers

import com.natthapete.itskntc.models.PersonalRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/personal")
class PersonalController {

    @PostMapping("/information")
    fun postPersonalInformation(
        @RequestBody personalRequest: PersonalRequest
    ) : ResponseEntity<*> {
        return ResponseEntity.ok("fullname: ${personalRequest.firstname}  ${personalRequest.lastname}")
    }
}