package com.airplane.management_system.model;

import com.airplane.management_system.enums.Cities;
import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ticketID;
    @Column(name = "departure_location")
    private Cities from;
    @Column(name = "arrival_location")
    private Cities to;
    private Double ticketPrice;


}
