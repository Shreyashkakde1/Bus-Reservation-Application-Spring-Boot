package com.redbus.RedBus.controller;

import com.redbus.RedBus.payloads.BusDto;
import com.redbus.RedBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {
    @Autowired
    private BusService busService;

    // Endpoint to add bus details
    @PostMapping("/add")
    public ResponseEntity<String> addBusDetails(@RequestBody BusDto busDTO) {
        try {
            // Call the service method to add bus details
            busService.addBus(busDTO);
            return new ResponseEntity<>("Bus details added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed to add bus details", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
