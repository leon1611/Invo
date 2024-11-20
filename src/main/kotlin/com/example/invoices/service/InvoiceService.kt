package com.example.invoices.service

import com.example.invoices.dto.InvoiceDto
import com.example.invoices.entity.Invoice
import com.example.invoices.mapper.InvoiceMapper
import com.example.invoices.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class InvoiceService {

    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun getInvoices(): List<Invoice> {
        return invoiceRepository.findAll()
    }

    fun findById(id: Long): Optional<Invoice> {
        return invoiceRepository.findById(id)
    }

    fun save(invoiceDto: InvoiceDto): Invoice {
        val invoice: Invoice = InvoiceMapper.toEntity(invoiceDto)
        return invoiceRepository.save(invoice)
    }


}