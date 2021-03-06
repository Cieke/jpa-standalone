package com.realdolmen.course;

import com.realdolmen.course.domain.Book;
import com.realdolmen.course.domain.Passenger;
import com.realdolmen.course.domain.PassengerType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.persistence.Entity;
import javax.persistence.PersistenceException;

import java.time.Instant;
import java.time.LocalDate;

import static com.sun.tools.doclint.Entity.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PassengerPersistenceTest extends DataSetPersistenceTest {
    @Rule
    public ExpectedException expector = ExpectedException.none();

    @Test
    public void passengerCanBePersisted() throws Exception {


        Passenger passenger = new Passenger(1000, "TestFirstName","bla","bla", 131354, LocalDate.of(2006,2,23), PassengerType.OCCASIONAL);
        entityManager().persist(passenger);
        assertNotNull(passenger.getId());
    }



    @Test
    public void passengerCanBeRetrievedById() throws Exception {
        assertEquals("Hayley", entityManager().find(Passenger.class, 10000).getFirstName());
    }

   @Test
   public void passsengerHasAType() throws Exception{
       assertEquals(PassengerType.OCCASIONAL, entityManager().find(Passenger.class, 10000).getPassengerType());
    }

    @Test
    public void passengerTypeCanNotBeNull() throws Exception {


    }


}
