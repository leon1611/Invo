package com.example.invoices.mapper

import com.example.invoices.dto.InvoiceDto
import com.example.invoices.entity.Invoice

object InvoiceMapper {

    fun toEntity(invoiceDto: InvoiceDto): Invoice {

        val invoice = Invoice()
        invoice.code= invoiceDto.code
        invoice.createAt=invoiceDto.createdAt
        invoice.totalAmount=invoiceDto.total_Amount

        return invoice
    }
}