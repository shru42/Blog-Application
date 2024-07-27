package com.example.blogApplication.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
public class UserDto {
    private int id;
    @NotEmpty(message = "Name must not be empty")
    @Size(min = 4, message = "Username must be min of 4 chars")
    private String name;
    @Email(message = "Email is not valid")
    private String email;
    @NotEmpty(message = "Enter Password, it must not be empty")
    @Size(min = 5,message = "Password must contains atleast 5 chars")
    private String password;
    @NotEmpty(message = "About must not be empty")
    private String about;
}
