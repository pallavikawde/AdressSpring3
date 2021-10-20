package com.bridgelabs.AdressBookSpring1.builder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;



    @ExtendWith(MockitoExtension.class)
    class AddressBuilderTeste {

        @InjectMocks
        private AddressBuilder addressBuilder;

        @Test
        public void buildDOTest() {
            AddressBookDTO addressBookDTO = new AddressBookDTO();
            addressBookDTO.setName("Sam");
            addressBookDTO.setState("WB");
            AddressBookData addressBookDO = addressBuilder.buildDO(addressBookDTO);
            assertEquals("Sam", addressBookDTO.getName());
            assertEquals("WB", addressBookDTO.getState());
            assertEquals("Sam", addressBookDO.getName());
            assertEquals("WB", addressBookDO.getState());
        }
    }

}
