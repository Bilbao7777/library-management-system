package com.example.demo.model;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Project {
    private String name;
    private Double budget;
    private Float duration;
    private byte number;

}
