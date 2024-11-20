package com.example.invoices.repository


import com.example.invoices.entity.Lead
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LeadRepository: JpaRepository<Lead, Long> {
    fun getLeadById(id: Long?): Lead?
}