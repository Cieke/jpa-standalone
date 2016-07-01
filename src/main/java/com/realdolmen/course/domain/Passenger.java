package com.realdolmen.course.domain;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by tywinlannister on 30/06/16.
 */
@Entity
public class Passenger {
    @Id
    private Integer id;

    private String ssn;         // soc sec number
    private String firstName;
    private String lastName;
    private Integer frequentFlyerMiles;

    @Transient
    private int age;

    //@Temporal(TemporalType.DATE)
    @Column (nullable = false)
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private PassengerType passengerType;

    protected Passenger() {     //default constructor
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setFrequentFlyerMiles(Integer frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
    public int getAge() {
        return age;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public Integer getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public Passenger(Integer id, String firstName, String lastName, String ssn, Integer frequentFlyerMiles, LocalDate dateOfBirth, PassengerType passengerType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.frequentFlyerMiles = frequentFlyerMiles;
        this.dateOfBirth = dateOfBirth;
        this.passengerType = passengerType;


    }

}
