package com.airplane.management_system.model;

import com.airplane.management_system.enums.Cities;
import jakarta.persistence.*;

@Entity
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planeID;

    @Column(name = "departure_location")
    private Cities from;

    @Column(name = "arrival_location")
    private Cities to;

    private Integer planeCapacity;

}
