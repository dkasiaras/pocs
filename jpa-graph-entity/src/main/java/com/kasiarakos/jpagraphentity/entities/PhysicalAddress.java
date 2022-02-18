package com.kasiarakos.jpagraphentity.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "physical")
@Getter
@Setter
public class PhysicalAddress extends Address {

    @OneToOne
    @JoinColumn(name = "address_id")
    private Coordinates coordinates;
}
