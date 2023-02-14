package com.example.maperstruck.mapper;

import com.example.maperstruck.dto.AddressDto;
import com.example.maperstruck.model.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressToAddressDtoMapper {
  AddressDto toDto(Address address);
  Address toAddress(AddressDto dto);
}
