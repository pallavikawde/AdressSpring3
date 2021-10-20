package com.bridgelabs.AdressBookSpring1.service;

import com.bridgelabs.AdressBookSpring1.dto.AdressBookDto;
import org.dom4j.tree.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAdressBookService extends JpaRepository<AbstractEntity Integer> {


}