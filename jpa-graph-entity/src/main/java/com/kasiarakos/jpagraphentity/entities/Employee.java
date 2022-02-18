package com.kasiarakos.jpagraphentity.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedEntityGraph(name = "employee.complete", attributeNodes = {
        @NamedAttributeNode(
                value = "addresses",
                subgraph = "address_city"
        )},
        subgraphs = {
                @NamedSubgraph(
                        name = "address_city",
                        attributeNodes = {
                                @NamedAttributeNode("city")
                        }),
                @NamedSubgraph(
                        name = "address_city",
                        attributeNodes = {
                                @NamedAttributeNode("city")
                        })
        },
        subclassSubgraphs = {
                @NamedSubgraph(
                        name = "noUse",
                        type = Engineer.class,
                        attributeNodes = {
                                @NamedAttributeNode("laptop")
                        })
        }
)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "profession")
public class Employee {

    @Id
    String id;

    String name;

    String email;

    @OneToMany
    @JoinColumn(name = "employee_id", updatable = false)
    List<Address> addresses;

}
