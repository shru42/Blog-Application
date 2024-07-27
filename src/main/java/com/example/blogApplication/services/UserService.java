package com.example.blogApplication.services;

import com.example.blogApplication.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto user, Integer id);
    UserDto getUserById(Integer user);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);

}
