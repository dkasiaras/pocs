package com.kasiarakos.jpagraphentity.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Coordinates {

    @Id
    String addressId;

    String latitude;
    String longitude;
}
