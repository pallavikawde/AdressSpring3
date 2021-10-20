package com.bridgelabs.AdressBookSpring1.service;

import com.bridgelabs.AdressBookSpring1.AdressBookSpring1Application;
import com.bridgelabs.AdressBookSpring1.Model.AdressBookEntity;
import com.bridgelabs.AdressBookSpring1.dto.ResponceDto;
import com.bridgelabs.AdressBookSpring1.repository.AdressBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AdressBookServicetest {

    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private AddressBuilder addressBuilder;

    @Test
    public void getPersonByID_WhenIdIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        Assertions.assertEquals(1, addressBookData.getId());
    }

    @Test
    public void getPersonByName_WhenNameIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Sam");
        Assertions.assertEquals("Sam", addressBookData.getName());
    }

    @Test
    public void addPersonDetails_WhenDetailingIsAdded() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        addressBookData.setName("Sam");
        addressBookData.setMobileNo("0747");
        addressBookData.setCity("Kolkata");
        addressBookData.setState("WB");
        addressBookData.setEmail("src@gmail.com");
        Assertions.assertEquals(1, addressBookData.getId());
        assertThat(addressBookData.getName()).isEqualTo("Sam");
        assertThat(addressBookData.getMobileNo()).isEqualTo("0747");
        assertThat(addressBookData.getCity()).isEqualTo("Kolkata");
        assertThat(addressBookData.getState()).isEqualTo("WB");
        assertThat(addressBookData.getEmail()).isEqualTo("src@gmail.com");
    }
}

