package com.natthapete.itskntc.services

import com.natthapete.itskntc.models.PersonalRequest
import com.natthapete.itskntc.models.PersonalResponse

interface PersonalService {
    fun getPersonal(personalRequest: PersonalRequest) : PersonalResponse
}