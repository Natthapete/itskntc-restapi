package com.natthapete.itskntc.services.impl

import com.natthapete.itskntc.models.PersonalRequest
import com.natthapete.itskntc.models.PersonalResponse
import com.natthapete.itskntc.services.PersonalService
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Year
import java.time.chrono.ThaiBuddhistDate

@Service
class PersonalServiceImpl : PersonalService{

    override fun getPersonal(
        personalRequest: PersonalRequest
    ): PersonalResponse {
        val personalId: String = subYear(LocalDate.now().year) + "10001"
        return PersonalResponse(
            personalId = personalId,
            firstname = personalRequest.firstname,
            lastname = personalRequest.lastname
        )
    }

    fun subYear(year: Int): String {
        val years = (year + 543) - 2500
        return years.toString()
    }
}