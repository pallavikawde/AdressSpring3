package com.bridgelabs.AdressBookSpring1.builder;

import com.bridgelabs.AdressBookSpring1.Model.AdressBookEntity;
import com.bridgelabs.AdressBookSpring1.dto.AdressBookDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AdressBuilder {

    public AdressBookEntity buildDO(AdressBookDto addressBookDTO) {
        AdressBookEntity addressBookDO = new AdressBookEntity();
        BeanUtils.copyProperties(addressBookDTO, addressBookDO);
        return addressBookDO;
    }
}