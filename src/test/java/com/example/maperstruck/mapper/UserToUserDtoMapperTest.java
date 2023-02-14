package com.example.maperstruck.mapper;

import com.example.maperstruck.dto.AddressDto;
import com.example.maperstruck.dto.UserDto;
import com.example.maperstruck.model.Address;
import com.example.maperstruck.model.User;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class UserToUserDtoMapperTest {
    UserToUserDtoMapper mapper = Mappers.getMapper(UserToUserDtoMapper.class);

    @Test
    public void whenGivenAnUserTheMapperCanMapItToAnDto() {
        Address address = Address.builder().build();
        User user = User.builder()
                .id(10)
                .age(35)
                .name("Maxine Musterfrau")
                .address(address)
                .build();

        UserDto dto = mapper.toDto(user);

        assertAll(
                () -> assertEquals(user.getId(), dto.getIdUser()),
                () -> assertEquals(user.getAge(), dto.getAge()),
                () -> assertEquals(user.getName(), dto.getName()),
                () -> assertNotNull(dto.getAddress())
        );
    }

    @Test
    public void whenGivenAnUserDtoTheMapperCanMapItToAnUser() {
        AddressDto address = AddressDto.builder().build();
        UserDto dto = UserDto.builder()
                .idUser(10)
                .age(35)
                .name("Maxine Musterfrau")
                .address(address)
                .build();

        User user = mapper.toUser(dto);

        assertAll(
                () -> assertEquals(dto.getIdUser(), user.getId()),
                () -> assertEquals(dto.getAge(), user.getAge()),
                () -> assertEquals(dto.getName(), user.getName()),
                () -> assertNotNull(user.getAddress())
        );
    }
}
