package com.example.maperstruck.converter.address;

import com.example.maperstruck.dto.AddressDto;
import com.example.maperstruck.model.Address;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;


@Mapper(componentModel = "spring")
public interface DtoToAddressConverter extends Converter<AddressDto, Address> {

    @Override
    Address convert(AddressDto source);
}
