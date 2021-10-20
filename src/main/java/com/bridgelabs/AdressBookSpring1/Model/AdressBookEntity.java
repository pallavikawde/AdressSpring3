package com.bridgelabs.AdressBookSpring1.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table

public class AdressBookEntity {
 @Id
  private int id;
  private String name;
  private int mobileNo;
  private String address;


}
