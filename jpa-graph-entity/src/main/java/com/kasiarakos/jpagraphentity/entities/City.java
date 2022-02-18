package com.kasiarakos.jpagraphentity.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class City {

    @Id
    String id;
    String name;
}
