package com.example.invoices.controller

import com.example.invoices.dto.InvoiceDto
import com.example.invoices.entity.Invoice
import com.example.invoices.response.ErrorResponse
import com.example.invoices.response.SuccessResponse
import com.example.invoices.service.InvoiceService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/invoice")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun getInvoices(): ResponseEntity<Any> {
        return try {
            val invoice = invoiceService.getInvoices()
            ResponseEntity(SuccessResponse(data = invoice), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obterner las facturas", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val invoice = invoiceService.findById(id)
            ResponseEntity(SuccessResponse(data = invoice), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obtener la factura", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid invoiceDto: InvoiceDto): Invoice {
        return invoiceService.save(invoiceDto)
    }


}