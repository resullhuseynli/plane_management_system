package com.airplane.management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Plane {

    @Id
    private String planeID;
    private Integer planeCapacity;

    public Plane() {};

    public String getPlaneID() {
        return planeID;
    }

    public Integer getPlaneCapacity() {
        return planeCapacity;
    }

    public Plane(String planeID, Integer planeCapacity) {
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }
}
