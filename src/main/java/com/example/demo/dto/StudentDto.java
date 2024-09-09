package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class StudentDto {


    private Long id;
    private String fullName;
    private  String email;

}
