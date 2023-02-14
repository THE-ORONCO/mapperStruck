package com.example.maperstruck.model;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class User {
  private long id;
  private String name;
  private int age;
  private Address address;
}
