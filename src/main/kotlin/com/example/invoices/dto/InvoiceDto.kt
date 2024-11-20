package com.example.invoices.dto

import jakarta.validation.constraints.NotNull
import java.time.LocalDate


class InvoiceDto {

    @NotNull(message = "code cannot be null")
    var code: String? = ""

    @NotNull(message = "CreatedAt cannot be null")
    var createdAt: LocalDate? = null

    @NotNull(message = "Total cannot be null")
    var total_Amount: Double? = null




}