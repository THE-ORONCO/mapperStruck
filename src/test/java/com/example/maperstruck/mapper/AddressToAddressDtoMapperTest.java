package com.example.maperstruck.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.example.maperstruck.dto.AddressDto;
import com.example.maperstruck.model.Address;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class AddressToAddressDtoMapperTest {
  AddressToAddressDtoMapper mapper = Mappers.getMapper(AddressToAddressDtoMapper.class);

  @Test
  public void whenGivenAnAddressTheMapperCanMapItToAnDto() {
    Address address = Address.builder()
                             .country("Germany")
                             .district("BW")
                             .city("Neu-Ulm")
                             .street("Marlene-Dietrich-Straße")
                             .houseNumber("5")
                             .build();

    AddressDto dto = mapper.toDto(address);

    assertAll(
            () -> assertEquals(address.getCountry(), dto.getCountry()),
            () -> assertEquals(address.getDistrict(), dto.getDistrict()),
            () -> assertEquals(address.getCity(), dto.getCity()),
            () -> assertEquals(address.getStreet(), dto.getStreet()),
            () -> assertEquals(address.getHouseNumber(), dto.getHouseNumber()));
  }

  @Test
  public void whenGivenAnAddressDtoTheMapperCanMapItToAnAddress() {
    AddressDto dto = AddressDto.builder()
                             .country("Germany")
                             .district("BW")
                             .city("Neu-Ulm")
                             .street("Marlene-Dietrich-Straße")
                             .houseNumber("5")
                             .build();

    Address address = mapper.toAddress(dto);

    assertAll(
            () -> assertEquals(dto.getCountry(), address.getCountry()),
            () -> assertEquals(dto.getDistrict(), address.getDistrict()),
            () -> assertEquals(dto.getCity(), address.getCity()),
            () -> assertEquals(dto.getStreet(), address.getStreet()),
            () -> assertEquals(dto.getHouseNumber(), address.getHouseNumber()));
  }
}
