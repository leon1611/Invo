package com.example.invoices.repository

import com.example.invoices.entity.Activity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ActivityRepository: JpaRepository<Activity, Long> {
    fun findById(id: Long?): Activity?
}