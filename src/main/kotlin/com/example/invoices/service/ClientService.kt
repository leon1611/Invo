package com.example.invoices.service

import com.example.invoices.dto.ClientDto
import com.example.invoices.entity.Client
import com.example.invoices.mapper.ClientMapper
import com.example.invoices.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientRepository

    fun getClients ():List<Client>{
        return clientRepository.findAll()
    }

    fun getClientById(id: Long): Client? {
        return clientRepository.getClientById(id)
    }

    fun save(clientDto: ClientDto): Client{
        val client:Client = ClientMapper.toEntity(clientDto)
        return clientRepository.save(client)
    }


}