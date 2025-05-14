package com.airplane.management_system.model;

import jakarta.persistence.*;

import java.sql.Date;

public class Ticket {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ticketID;
    private Double ticketPrice;
    private Date flightDate;
    private Flight flight;

    public Long getTicketID() {
        return ticketID;
    }

    public void setTicketID(Long ticketID) {
        this.ticketID = ticketID;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}
