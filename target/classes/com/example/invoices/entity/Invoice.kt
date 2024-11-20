package com.example.invoices.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "invoice")

class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column (nullable = false)
    var code: String? = null
    @Column (nullable = false)
    var createAt: LocalDate? = null
    @Column (nullable = false)
    var totalAmount : Double? = null

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    var client: Client? = null

}