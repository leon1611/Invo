package com.example.invoices.repository

import com.example.invoices.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client, Long> {
    fun getClientById(id: Long?): Client?
}