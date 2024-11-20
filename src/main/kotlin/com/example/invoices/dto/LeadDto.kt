package com.example.invoices.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDate

class LeadDto {

    @NotNull(message = "Full name can't be null")
    var fullName: String = ""
    @NotNull(message = "Email can't be null")
    var email: String = ""
    @NotNull(message = "Phone can't be null")
    var phone: String = ""
    @NotNull(message = "Status can't be null")
    var status: String = "new"
    @NotNull(message = "CreatedAt cannot be null")
    var createdAt: LocalDate? = null

}