package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Capital;

    //here we are trying to show how not to make column in table  even writing it inside the entity.
    //We are using @Transient annotation to do it.
    //for an instance we can calculate the age from the date of birth, therefore we can keep age in
    // inside the @Transient annotation.


    @Transient
    private Integer countryCode;


}
