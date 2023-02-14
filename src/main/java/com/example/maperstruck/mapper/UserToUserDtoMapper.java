package com.example.maperstruck.mapper;

import com.example.maperstruck.dto.UserDto;
import com.example.maperstruck.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserToUserDtoMapper {
    @Mapping(target = "idUser", source = "id")
    UserDto toDto(User user);

    @Mapping(target = "id", source = "idUser")
    User toUser(UserDto dto);
}
