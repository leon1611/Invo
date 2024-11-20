package com.example.invoices.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "lead")

class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column (unique = true, nullable = false)
    var fullname: String? = null
    @Column (unique = true, nullable = false)
    var email: String? = null
    @Column (unique = true, nullable = false)
    var phone: String? = null
    @Column (unique = true, nullable = false)
    var status: String? = null
    @Column (unique = true, nullable = false)
    var createAt: LocalDate? = null


}