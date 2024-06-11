package com.dio.bank.domain.model;

import jakarta.persistence.*;

// DRY
@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String icon;
    private String description;
}
