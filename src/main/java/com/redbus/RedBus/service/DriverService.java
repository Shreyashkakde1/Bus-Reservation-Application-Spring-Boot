package com.redbus.RedBus.service;

import com.redbus.RedBus.payloads.DriverDto;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {
    DriverDto addDriver(DriverDto driver);
}
