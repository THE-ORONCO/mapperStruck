package com.example.maperstruck.converter.user;

import com.example.maperstruck.dto.UserDto;
import com.example.maperstruck.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface UserToDtoConverter extends Converter<User, UserDto> {

    @Override
    @Mapping(target = "idUser", source = "id")
    UserDto convert(User source);
}
