package com.example.invoices.controller

import com.example.invoices.dto.LeadDto
import com.example.invoices.entity.Lead
import com.example.invoices.response.ErrorResponse
import com.example.invoices.response.SuccessResponse
import com.example.invoices.service.LeadService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/leads")
class LeadController {

    @Autowired
    lateinit var leadService: LeadService


    @GetMapping()
    fun getLeads(): ResponseEntity<Any> {
        return try {
            val lead = leadService.getLeads()
            ResponseEntity(SuccessResponse(data = lead), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obterner leads", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun getLeadById (@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val lead = leadService.getLeadById(id)
            if (lead != null) {
                ResponseEntity(SuccessResponse(data = lead), HttpStatus.OK)
            } else {
                ResponseEntity(ErrorResponse(message = "Lead no encontrado", code = 404), HttpStatus.NOT_FOUND)
            }
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obtener Lead", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid leadDto: LeadDto): Lead{
        return leadService.save(leadDto)
    }



}