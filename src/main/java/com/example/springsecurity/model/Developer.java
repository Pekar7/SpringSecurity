package com.example.springsecurity.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
