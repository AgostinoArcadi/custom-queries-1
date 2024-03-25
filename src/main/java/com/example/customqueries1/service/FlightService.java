package com.example.customqueries1.service;

import com.example.customqueries1.entity.Flight;
import com.example.customqueries1.entity.StatusEnum;
import com.example.customqueries1.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> generateFlights() {
        List<Flight> flights = new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription("Description: " + randomString());
            flight.setFromAirport("From: " + randomString());
            flight.setToAirport("To: " + randomString());
            flight.setStatus(StatusEnum.ON_TIME);
            flights.add(flight);
        }
        List<Flight> flightSaved = flightRepository.saveAll(flights);
        return flightSaved;
    }

    private String randomString() {
        UUID randomUUID = UUID.randomUUID();
        String randomString = randomUUID.toString().replaceAll("-", "");

        return randomString.substring(22);
    }
}
