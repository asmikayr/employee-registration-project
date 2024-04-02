package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {
    private String firstName,lastName, email, password, address, address2, city, state, zipcode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

}
