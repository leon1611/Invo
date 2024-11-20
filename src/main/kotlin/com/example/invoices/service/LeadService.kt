package com.example.invoices.service

import com.example.invoices.dto.LeadDto
import com.example.invoices.entity.Lead
import com.example.invoices.mapper.LeadMapper
import com.example.invoices.repository.LeadRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeadService {

    @Autowired
    lateinit var leadRepository: LeadRepository

    fun getLeads ():List<Lead>{
        return leadRepository.findAll()
    }

    fun getLeadById(id: Long): Lead? {
        return leadRepository.getLeadById(id)
    }

    fun save(leadDto: LeadDto): Lead{
        val lead:Lead = LeadMapper.toEntity(leadDto)
        return leadRepository.save(lead)
    }


}