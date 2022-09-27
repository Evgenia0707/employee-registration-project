package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull //Field shouldn't be null
//    @NotEmpty// Field shouldn't be "" - empty
//    @NotBlank//Field shouldn't be "   " - blank -> covering all of them

//    @NotNull -> @NotNull
//    @NotEmpty -> @NotNull + @NotEmpty
//    @NotBlank -> @NotNull + @NotEmpty + NotBlank

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts (save) yyyy-MM-dd  LocalDate accepts mm-dd-yyyy

//    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")// add for save in format
    private LocalDate birthday;

//    @NotBlank
//    @Email
    private String email;

//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
