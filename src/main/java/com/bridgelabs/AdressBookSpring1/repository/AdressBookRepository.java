package com.bridgelabs.AdressBookSpring1.repository;

import com.bridgelabs.AdressBookSpring1.Model.AdressBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressBookRepository extends JpaRepository<AdressBookEntity,Integer> {
}
