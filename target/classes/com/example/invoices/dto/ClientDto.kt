package com.example.invoices.dto

import jakarta.validation.constraints.NotNull

class ClientDto {

    @NotNull( message =  "FullName can't be null")
    val fullName: String= ""

    @NotNull(message =  "Age can't be null")
    var  age : Int? = null

    @NotNull(message =  "Address can't be null")
    var address : String? = ""


}