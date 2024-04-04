package com.redbus.RedBus.service;


import com.redbus.RedBus.payloads.BusDto;
import org.springframework.stereotype.Service;

@Service
public interface BusService {
    void addBus(BusDto busDTO);
}
