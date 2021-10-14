package com.codeclan.example.coursebookingsystem.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "age")
    private int age;
}
