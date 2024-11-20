package com.example.invoices.mapper

import com.example.invoices.dto.ClientDto
import com.example.invoices.entity.Client

object ClientMapper {

    fun toEntity(clientDto: ClientDto): Client {

        val client = Client()
        client.fullname = clientDto.fullName
        client.age = clientDto.age
        client.address = clientDto.address

        return client
    }


}