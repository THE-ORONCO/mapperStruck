package com.example.maperstruck.controller;

import com.example.maperstruck.dto.UserDto;
import com.example.maperstruck.model.Address;
import com.example.maperstruck.model.User;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final ConversionService conversionService;
    private final List<User> users;

    public UserController(ConversionService conversionService) {
        this.conversionService = conversionService;
        users = List.of(new User(421, "Ralf Günter", 68, new Address("Gerfew", "Cvaria", "Mjunik", "Strassse", "yes")));
    }

    @GetMapping("users")
    public List<UserDto> getUsers() {
        return users.stream().map(u -> conversionService.convert(u, UserDto.class)).toList();
    }
}
