package com.bridgelabs.AdressBookSpring1.controller;

import com.bridgelabs.AdressBookSpring1.dto.AdressBookDto;
import com.bridgelabs.AdressBookSpring1.Model.AdressBookEntity;
import com.bridgelabs.AdressBookSpring1.service.AdressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RequestMapping("/Api")
  @RestController
@EnableSwagger2
public class AdressBookController {

    @Autowired
private  AdressBookService adressBookService;
    @GetMapping
    public List<AdressBookEntity>Contacts(){
        return adressBookService.Contacts();
    }

    @GetMapping(value="/get-by-id")
    public AdressBookEntity getById(@RequestParam int Id){
        return adressBookService.getById(Id);
    }

    @PostMapping(value= "/add-contact")
    public AdressBookEntity addContact(@RequestBody AdressBookDto adressBookDto){
        return adressBookService.addContact(adressBookDto);

    }
    @DeleteMapping(value="/delete-id")
    public String deleteId(@RequestParam int id){
      return adressBookService.deletById(id);
    }


    @PutMapping(value="/update-contact")
      public AdressBookEntity update (@RequestBody AdressBookDto adressBookDto){
        return adressBookService.update(adressBookDto);
    }


}
