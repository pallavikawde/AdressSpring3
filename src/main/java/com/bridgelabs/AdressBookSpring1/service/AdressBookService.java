package com.bridgelabs.AdressBookSpring1.service;

import com.bridgelabs.AdressBookSpring1.dto.AdressBookDto;
import com.bridgelabs.AdressBookSpring1.Model.AdressBookEntity;
import com.bridgelabs.AdressBookSpring1.exception.CustomeException;
import com.bridgelabs.AdressBookSpring1.repository.AdressBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdressBookService {

    @Autowired
    private AdressBookRepository adressBookRepository;

    @Autowired
    private ModelMapper moddlmapper;


    /**
     * finding by id
     * @author pallavi jagtap
     * @version 0.0.1
     * @since 13-10-2021
     * @param id
     * @return
     */

    public AdressBookEntity getById(int id) {
     Optional<AdressBookEntity> adressBookEntity = adressBookRepository.findById(id);
     if(adressBookEntity.isPresent()){
     return adressBookEntity.get();
       }
     return null;
     }


    /**
     * adding contacts
     *  @author pallavi jagtap
     *  @version 0.0.1
     *  @since 14-10-2021
     * @param adressBookDto
     * @return
     */
    public AdressBookEntity addContact(AdressBookDto adressBookDto) {
        AdressBookEntity adressBookEntity = new AdressBookEntity();
        moddlmapper.map(adressBookDto,adressBookEntity);
        return adressBookRepository.save(adressBookEntity);
    }

    /**
     * @author pallavi jagtap
     * @version 0.0.1
     * @since 14-10-2021
     * @param id
     * @return
     */

    public String deletById(int id) {
        Optional<AdressBookEntity>adressBookEntity = adressBookRepository.findById(id);
        if (adressBookEntity.isPresent()) {
            adressBookRepository.delete(adressBookEntity.get());
            return "record is deleted sucssefully";
        }
       // return "recodrd not exists";
        throw new CustomeException("Record does not exists with this id : " + id);

    }

    public AdressBookEntity update(AdressBookDto adressBookDto) {
         Optional<AdressBookEntity> adressBookEntity = adressBookRepository.findById(adressBookDto.getId());
         AdressBookEntity adressBookEntity1 = new AdressBookEntity();
         if(adressBookEntity.isPresent()){
             adressBookEntity1.setName(adressBookDto.getName());
             adressBookEntity1.setAddress(adressBookDto.getAddress());
             adressBookEntity1. setMobileNo(adressBookDto.getMobileNo());
             return adressBookRepository.save(adressBookEntity1);

         }
         return null;
    }
    List<AdressBookDto> addresses;
    public List<AdressBookDto> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<AdressBookDto> addresses) {
        this.addresses = addresses;
    }

    public AdressBookDto addAddressBook(AdressBookDto addressBookDTO) {
        return addressBookDTO;
    }

    public List<AdressBookEntity> Contacts() {
        return adressBookRepository.findAll();
    }
}
