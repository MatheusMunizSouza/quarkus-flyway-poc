package com.matheus.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "persons", schema = "flyway")
public class Person extends PanacheEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "surname")
    public String surname;

    public static Person findByName(String name){
        return find("name", name).firstResult();
    }

}
