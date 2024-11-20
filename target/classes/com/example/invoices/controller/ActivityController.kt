package com.example.invoices.controller

import com.example.invoices.dto.ActivityDto
import com.example.invoices.dto.InvoiceDto
import com.example.invoices.entity.Activity
import com.example.invoices.entity.Invoice
import com.example.invoices.response.ErrorResponse
import com.example.invoices.response.SuccessResponse
import com.example.invoices.service.ActivityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/activities")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService
    @GetMapping
    fun getActivities(): ResponseEntity<Any> {
        return try {
            val activity = activityService.getActivities()
            ResponseEntity(SuccessResponse(data = activity), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obterner las actividades", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun getActById(@PathVariable id: Long): ResponseEntity<Any> {
        return try {
            val activity = activityService.getActById(id)
            ResponseEntity(SuccessResponse(data = activity), HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity(ErrorResponse(message = "Error al obtener la actividad", code = 500), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto): Activity {
        return activityService.save(activityDto)
    }


}