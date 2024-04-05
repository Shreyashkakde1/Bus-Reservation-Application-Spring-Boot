package com.redbus.RedBus.service.impl;

import com.redbus.RedBus.entity.Bus;
import com.redbus.RedBus.entity.Driver;
import com.redbus.RedBus.repository.BusRepository;
import com.redbus.RedBus.repository.DriverRepository;
import com.redbus.RedBus.service.BusService;
import org.hibernate.annotations.Array;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.redbus.RedBus.payloads.BusDto;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addBus(BusDto busDto) {
        // Convert DTO to entity
        Bus bus = modelMapper.map(busDto,Bus.class);
        Driver driver = modelMapper.map(bus.getDriver(),Driver.class);


        // Save the Driver entity
        Driver savedDriver = driverRepository.save(driver);
        bus.setDriver(savedDriver);

        // Save the bus entity
        busRepository.save(bus);
    }

}
