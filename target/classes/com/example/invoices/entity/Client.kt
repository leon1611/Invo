package com.example.invoices.entity

import jakarta.persistence.*

@Entity
@Table(name = "client")

class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column (unique = true, nullable = false)
    var fullname: String? = null
    @Column (unique = true, nullable = false)
    var age: Int? = null
    @Column (unique = true, nullable = false)
    var address: String? = null



}