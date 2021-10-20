package com.bridgelabs.AdressBookSpring1.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;


@ExtendWith(MockitoExtension.class)
public class CotrollerTest {

    @InjectMocks
    private AddressBookAppController addressBookAppController;

    @Mock
    private IAddressBookService iAddressBookService;

    @Test
    public void getAddressTest() {
        when(iAddressBookService.getAddresses()).thenReturn(Lists.newArrayList(new AddressBookDTO()));
        IAddressBookService addressBookController;
        ResponseEntity<List<AddressBookDTO>> responseEntity = null;
        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(1, responseEntity.getBody().size());
    }
}
