package com.airplane.management_system.model;

import com.airplane.management_system.enums.Cities;
import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightID;

    @Column(name = "departure_location")
    private Cities from;
    @Column(name = "arrival_location")
    private Cities to;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    private Plane plane;

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Integer getFlightID() {
        return flightID;
    }

    public void setFlightID(Integer flightID) {
        this.flightID = flightID;
    }

    public Cities getFrom() {
        return from;
    }

    public void setFrom(Cities from) {
        this.from = from;
    }

    public Cities getTo() {
        return to;
    }

    public void setTo(Cities to) {
        this.to = to;
    }
}
