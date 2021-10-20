package com.bridgelabs.AdressBookSpring1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
public class AdressBookDto {
    @Id
    private int id;
    private String name;
    private int mobileNo;
    private String address;

    public AdressBookDto() {

    }

    public void setState(String wb) {
    }



    }

