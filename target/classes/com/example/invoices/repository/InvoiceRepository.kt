package com.example.invoices.repository

import com.example.invoices.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface InvoiceRepository: JpaRepository<Invoice, Long> {
    fun findById(id: Long?): Invoice?
}