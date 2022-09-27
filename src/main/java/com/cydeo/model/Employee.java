package com.cydeo.model;

import lombok.*;

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
    private LocalDate birthday;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
