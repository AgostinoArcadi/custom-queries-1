package com.example.customqueries1.controller;

import com.example.customqueries1.entity.Flight;
import com.example.customqueries1.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @PostMapping("/generate-flights")
    public ResponseEntity<List<Flight>> generateFlights() {
        List<Flight> flights = flightService.generateFlights();

        return ResponseEntity.ok().body(flights);
    }

    @GetMapping("get-all")
    public ResponseEntity<List<Flight>> getAll() {
        List<Flight> flights = flightService.getAll();

        return ResponseEntity.ok().body(flights);
    }

}
