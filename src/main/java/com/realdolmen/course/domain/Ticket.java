package com.realdolmen.course.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by tywinlannister on 01/07/16.
 */
@Entity
public class Ticket {
    @Id
    private Integer ticketID;
    private double price;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket(int ticketID, double price) {
        this.ticketID = ticketID;
        this.price = price;
    }
}
