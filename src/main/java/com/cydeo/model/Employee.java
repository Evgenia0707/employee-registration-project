package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String firstName;
    private String lastName;

    //Thymeleaf accepts (save) yyyy-MM-dd  LocalDate accepts mm-dd-yyyy

    @DateTimeFormat(pattern = "yyyy-MM-dd")// add for save in format
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
