package com.example.invoices.service

import com.example.invoices.dto.ActivityDto
import com.example.invoices.entity.Activity
import com.example.invoices.mapper.ActivityMapper
import com.example.invoices.repository.ActivityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ActivityService {

    @Autowired
    lateinit var activityRepository: ActivityRepository

    fun getActivities(): MutableList<Activity> {
        return activityRepository.findAll()
    }

    fun getActById(id: Long): Optional<Activity> {
        return activityRepository.findById(id)
    }

    fun save(activityDto: ActivityDto): Activity {
        val activity: Activity = ActivityMapper.toEntity(activityDto)
        return activityRepository.save(activity)
    }


}