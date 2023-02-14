package com.example.maperstruck.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class AddressDto {
  private String country;
  private String district;
  private String city;
  private String street;
  private String houseNumber;
}
