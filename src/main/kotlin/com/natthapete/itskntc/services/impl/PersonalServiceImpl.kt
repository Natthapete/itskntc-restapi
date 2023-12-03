package com.natthapete.itskntc.services.impl

import com.natthapete.itskntc.models.PersonalRequest
import com.natthapete.itskntc.models.PersonalResponse
import com.natthapete.itskntc.services.PersonalService
import org.springframework.stereotype.Service

@Service
class PersonalServiceImpl : PersonalService {

    override fun getPersonal(
        personalRequest: PersonalRequest
    ): PersonalResponse {
        TODO("Not yet implemented")
    }
}