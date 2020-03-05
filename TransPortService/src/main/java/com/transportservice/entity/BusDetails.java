package com.transportservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="BusDetails")
public class BusDetails {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column()
  String id;
  @Column
  String Name;
  @Column
  Integer number;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }
}
