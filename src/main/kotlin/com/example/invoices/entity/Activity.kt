package com.example.invoices.entity

import jakarta.persistence.*
import java.time.LocalDate

class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column(nullable = false)
    var description: String? = null
    @Column(nullable = false)
    var activityDate: LocalDate? = null
    @Column(nullable = false)

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    var lead: Lead? = null
}
