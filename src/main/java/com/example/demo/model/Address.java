package com.example.demo.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String zipcode;




}
