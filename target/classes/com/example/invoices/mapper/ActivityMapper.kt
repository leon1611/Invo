package com.example.invoices.mapper

import com.example.invoices.dto.ActivityDto
import com.example.invoices.entity.Activity

object ActivityMapper {

    fun toEntity(activityDto: ActivityDto): Activity {

        val activity = Activity()
        activity.description= activityDto.description
       activity.activityDate=activityDto.activityDate
        return activity
    }
}