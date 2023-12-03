package com.natthapete.itskntc.models

data class PersonalRequest(
    var firstname: String = "",
    var lastname: String = "",
    var birthdate: String = "", // 10/10/2023
    var age: Int = 0,
    var telephone: String = "",
    var height: Double = 0.00,
    var weight: Double = 0.00,
    var career: String = "",
    var national: String = "",
    var education: String = ""
)