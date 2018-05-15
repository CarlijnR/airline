package com.capgemini.airline.model;

import javax.persistence.Entity;

@Entity
public class Airline {

    private String name;

    Airplane[] myAirplanes;

    public Airline(String name, Airplane[] myAirplanes) {
        this.name = name;
        this.myAirplanes = myAirplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
