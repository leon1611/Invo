package com.example.invoices.mapper

import com.example.invoices.dto.LeadDto
import com.example.invoices.entity.Lead

object LeadMapper {

    fun toEntity(leadDto: LeadDto): Lead {

        val lead = Lead()
        lead.fullname = leadDto.fullName
        lead.email= leadDto.email
        lead.phone = leadDto.phone
        lead.status = leadDto.status
        lead.createAt=leadDto.createdAt

        return lead
    }

}