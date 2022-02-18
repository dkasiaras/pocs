package com.kasiarakos.jpagraphentity.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Laptop {

    @Id
    @Column(name = "employee_id")
    String employeeId;

    String brand;
}
