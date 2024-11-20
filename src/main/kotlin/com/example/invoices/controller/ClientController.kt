package com.example.invoices.controller

import com.example.invoices.dto.ClientDto
import com.example.invoices.entity.Client
import com.example.invoices.response.ErrorResponse
import com.example.invoices.response.SuccessResponse
import com.example.invoices.service.ClientService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/clients")
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping()
    fun getClients(): ResponseEntity<Any> {
        return try {
            val client = clientService.getClients()
            ResponseEntity(SuccessResponse(data = client), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obterner a los artistas", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun getClientById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val client = clientService.getClientById(id)
            if (client != null) {
                ResponseEntity(SuccessResponse(data = client), HttpStatus.OK)
            } else {
                ResponseEntity(ErrorResponse(message = "Cliente no encontrado", code = 404), HttpStatus.NOT_FOUND)
            }
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obtener el cliente", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid clientDto: ClientDto): Client{
        return clientService.save(clientDto)
    }



}