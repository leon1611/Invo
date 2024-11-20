package com.example.invoices.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDate

class ActivityDto {

    @NotNull(message = "Description can't be null")
    var description: String? = null

    @NotNull(message = "Date can't be null")
    var activityDate: LocalDate? = null
}