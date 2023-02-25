package com.epiloum.study.demo.entities;

import jakarta.persistence.*;

@Table(name = "users")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 100, nullable = false)
    public String name;
}
