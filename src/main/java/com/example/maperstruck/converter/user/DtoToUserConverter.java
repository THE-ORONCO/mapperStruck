package com.example.maperstruck.converter.user;

import com.example.maperstruck.dto.UserDto;
import com.example.maperstruck.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;


@Mapper(componentModel = "spring")
public interface DtoToUserConverter extends Converter<UserDto, User> {

    @Override
    @Mapping(target = "id", source = "idUser")
    User convert(UserDto source);
}
