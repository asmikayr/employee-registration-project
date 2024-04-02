package com.cydeo.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {
    private String firstName,lastName, email, password, address, address2, city, state, zipcode;
    private LocalDate birthday;

}
