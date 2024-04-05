package com.redbus.RedBus.controller;

import com.redbus.RedBus.payloads.DriverDto;
import com.redbus.RedBus.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/add")
    public ResponseEntity<DriverDto> addDriver(@RequestBody DriverDto driverDto) {
        DriverDto addedDriver = driverService.addDriver(driverDto);
        return new ResponseEntity<>(addedDriver, HttpStatus.CREATED);
    }
}
