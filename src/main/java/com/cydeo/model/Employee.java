package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {

    //@NotNull   ----> Field shouldn't be null
    //@NotEmpty  ----> Field shouldn't be ""
    //@NotBlank  ----> Field shouldn't be "        "
    //@NotNull   ----> @NotNull
    //@NotEmpty  ----> @NotNull + @NotEmpty
    //@NotBlank  ----> @NotNull + @NotEmpty +@NotBlanc
    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName,lastName;

  //  @NotBlank
    private String email;

//    @NotBlank
//    @Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address, address2, city, state, zipcode;

    //Thymeleaf accepts yyyy-MM-dd, nut LocalDate accepts mm-dd-yyyy
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

}
