package com.example.invoices.response

data class SuccessResponse(
    val status: String = "success",
    val data: Any? = null
)