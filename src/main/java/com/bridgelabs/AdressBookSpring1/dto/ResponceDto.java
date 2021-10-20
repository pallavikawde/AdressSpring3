package com.bridgelabs.AdressBookSpring1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponceDto {
   private String message;
   private Object data;
}
